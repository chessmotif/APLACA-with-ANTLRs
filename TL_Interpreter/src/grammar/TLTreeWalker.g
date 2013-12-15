tree grammar TLTreeWalker;

options {
  tokenVocab=TL;
  ASTLabelType=CommonTree;
}

@header { 
  import tl.tree.*; 
  import tl.tree.binNode.*;
  import tl.tree.relNode.*;
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
  : ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;
  
statement returns [TLNode node]
  : assignment {node =$assignment.node;}
  | functionCall {node = $functionCall.node;}
  | ifStatement {node = $ifStatement.node;}
  ;

functionCall  returns [TLNode node]
  :  ^(FUNC_CALL Identifier exprList?) 
  |  ^(FUNC_CALL Println expression?) {node = new PrintlnNode($expression.node);}
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
  : ^(ID_LIST Identifier+)
  ;
  
assignment
  : ^(ASSIGNMENT Identifier indexes? expression)
  | ^(TO_PRINT expression)
  ;

indexes returns [TLNode node]  
  : ^(INDEXES expression+)
  ;
  
exprList   returns [java.util.List<TLNode> e] 
  :  ^(EXP_LIST expression+)  
  ;
  
expression  returns [TLNode node]  
  :  ^('|_|' expression expression)  
  |  ^('&_&' expression expression)  
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
  |  ^('**' expression expression)  
  |  ^('^' expression expression)  
  |  ^('&' expression expression)  
  |  ^('|' expression expression)  
  |  ^(UNARY_MIN expression)  
  |  ^(NOT expression)  
  |  ^(BIN_NOT expression)  
  |  Number							{node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool							{node = new AtomNode(Boolean.parseBoolean($Bool.text));}
  |  Null							{node = new AtomNode(null);}
  |  In
  |  lookup             
  ;
  
list  returns [TLNode node]  
  :  ^(LIST exprList?)  
  ;  
  
lookup  returns [TLNode node]  
  :  ^(LOOKUP functionCall indexes?)  
  |  ^(LOOKUP list indexes?)  
  |  ^(LOOKUP expression indexes?)   
  |  ^(LOOKUP Identifier indexes?)  
  |  ^(LOOKUP String indexes?)  
  ;    