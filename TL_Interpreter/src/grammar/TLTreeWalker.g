tree grammar TLTreeWalker;

options {
  tokenVocab=TL;
  ASTLabelType=CommonTree;
}

@header { 
  import tl.tree.*; 
  import tl.tree.binNode.*;
  import tl.tree.relNode.*;
  import tl.tree.unaryNode.*;
  import java.util.Map; 
  import java.util.HashMap; 
}  
  
@members { 
  public Map<String, Function> functions = null; 
  Scope currentScope = null; 
   
  public TLTreeWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) { 
    this(nodes, null, fns); 
  } 
   
  public TLTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) { 
    super(nds); 
    currentScope = sc; 
    functions = fns; 
  } 
}  
  
walk returns [TLNode node]
  :  block		{node = $block.node;}
  ;

block returns [TLNode node]
@init { 
  BlockNode bn = new BlockNode(); 
  node = bn; 
  Scope scope = new Scope(currentScope); 
  currentScope = scope; 
}  
@after { 
  currentScope = currentScope.parent(); 
}  
  :	^(BLOCK 
  		^(STATEMENTS (statement  {bn.addStatement($statement.node);})*) 
  		^(RETURN (expression  {bn.addStatement($expression.node);})?)
  	)
  ;

delimitedBlock returns [TLNode node]
@init { 
  BlockNode bn = new BlockNode(); 
  node = bn; 
  Scope scope = new Scope(currentScope); 
  currentScope = scope; 
}  
@after { 
  currentScope = currentScope.parent(); 
}  
  :	^(BLOCK 
  		^(STATEMENTS (statement  {bn.addStatement($statement.node);})*) 
  		^(RETURN (expression  {bn.addStatement($expression.node);})?)
  	)
  ;
  
statement returns [TLNode node]
  : assignment {node =$assignment.node;}
  | functionCall {node = $functionCall.node;}
  | ifStatement {node = $ifStatement.node;}
  ;

functionCall  returns [TLNode node]
  :  ^(FUNC_CALL Identifier exprList?) {node = new FunctionCallNode($Identifier.text, $exprList.e, functions);}
  ;

ifStatement returns [TLNode node]
@init  { 
  IfNode ifNode = new IfNode(); 
  node = ifNode; 
}  
  : ^(IF (^(EXP e=expression a=block) {ifNode.addChoice($e.node,$a.node);})+ 
  		(^(EXP b=block)             {ifNode.addChoice(new AtomNode(true),$b.node);})?
  	)
  ;
    
idList returns [java.util.List<String> i] 
@init {i = new java.util.ArrayList<String>();}
  : ^(ID_LIST (Identifier {i.add($Identifier.text);})+)
  ;
  
assignment returns [TLNode node]
  : ^(ASSIGNMENT i=Identifier x=indexes? e=expression)   {node = new AssignmentNode($i.text, $x.e, $e.node, currentScope);}
  | ^(TO_PRINT expression)  {node = new OutNode($expression.node);}
  ;

indexes returns [List<TLNode> e]  
@init {e = new ArrayList<TLNode>();}
  : ^(INDEXES (expression  {e.add($expression.node);})+)
  ;
  
exprList   returns [java.util.List<TLNode> e] 
@init  {e = new java.util.ArrayList<TLNode>();}
  :  ^(EXP_LIST (expression {e.add($expression.node);})+)  
  ;
  
expression  returns [TLNode node]  
  :  ^('|_|' expression expression)  	{node = new OrNode($a.node, $b.node);}
  |  ^('&_&' expression expression)  	{node = new AndNode($a.node, $b.node);}
  |  ^('^_^' expression expression)  	{node = new XorNode($a.node, $b.node);}
  |  ^('=_=' a=expression b=expression)  {node = new EqNode($a.node, $b.node);}
  |  ^('>_<' a=expression b=expression)  {node = new NENode($a.node, $b.node);}
  |  ^('>_=' a=expression b=expression)  {node = new GTENode($a.node, $b.node);}
  |  ^('=_<' a=expression b=expression)  {node = new LTENode($a.node, $b.node);}
  |  ^('>_>' a=expression b=expression)  {node = new GTNode($a.node, $b.node);}
  |  ^('<_<' a=expression b=expression)  {node = new LTNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression)	{node = new AddNode($a.node, $b.node);}
  |  ^('-' a=expression b=expression)	{node = new SubNode($a.node, $b.node);}
  |  ^('*' a=expression b=expression)	{node = new MultNode($a.node, $b.node);}
  |  ^('/' a=expression b=expression)	{node = new DivNode($a.node, $b.node);}
  |  ^('//' a=expression b=expression)	{node = new QuotNode($a.node, $b.node);}
  |  ^('%' a=expression b=expression)	{node = new ModNode($a.node, $b.node);}
  |  ^('**' a=expression b=expression)  	{node = new PowerNode($a.node, $b.node);}
  |  ^('^' a=expression b=expression)  		{node = new BitXorNode($a.node, $b.node);}
  |  ^('&' a=expression b=expression)  		{node = new BitAndNode($a.node, $b.node);}
  |  ^('|' a=expression b=expression)  		{node = new BitOrNode($a.node, $b.node);}
  |  ^('#' a=expression b=expression)  		{node = new StrCatNode($a.node, $b.node);}
  |  ^(UNARY_MIN a=expression)  		{node = new MinusNode($a.node);}
  |  ^(NOT a=expression)  			{node = new NotNode($a.node);}
  |  ^(BIN_NOT a=expression)  		{node = new BinNegationNode($a.node);}
  |  Number							{node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool							{node = new AtomNode(Boolean.parseBoolean($Bool.text));}
  |  Null							{node = new AtomNode(null);}
  |  In
  |  lookup             			{node = $lookup.node;}  
  ;
  
list  returns [TLNode node]  
  :  ^(LIST exprList?)  {node = new ListNode($exprList.e);}
  ;  
  
lookup  returns [TLNode node]  
  :  ^(LOOKUP functionCall i=indexes?) {node = $i.e != null ? new LookupNode($functionCall.node, $indexes.e) : $functionCall.node;} 
  |  ^(LOOKUP list i=indexes?)   			{node = $i.e != null ? new LookupNode($list.node, $indexes.e) : $list.node;}
  |  ^(LOOKUP expression i=indexes?)   {node = $i.e != null ? new LookupNode($expression.node, $indexes.e) : $expression.node;}
  |  ^(LOOKUP Identifier i=indexes?)  {node = $i.e != null ? new LookupNode(new IdentifierNode($Identifier.text, currentScope), $indexes.e) : new IdentifierNode($Identifier.text, currentScope);}
  |  ^(LOOKUP String i=indexes?)  {node = $i.e != null ? new LookupNode(new AtomNode($String.text), $indexes.e) : new AtomNode($String.text);}
  ;    