tree grammar TLTreeWalker;

options {
  tokenVocab=TL;
  ASTLabelType=CommonTree;
}

@header { 
  import tl.tree.*; 
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
  :  block{node=null;}
  ;

block returns [TLNode node]
  :  ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;

delimitedBlock returns [TLNode node]
  : ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;
  
statement returns [TLNode node]
  : assignment
  | functionCall
  | ifStatement
  ;

functionCall  returns [TLNode node]
  :  ^(FUNC_CALL Identifier exprList?)  
  ;

ifStatement returns [TLNode node]
  : ^(IF ifStat elseIfStat* elseStat?)
  ;
  
ifStat
  : ^(EXP expression block)
  ;
  
elseIfStat
  : ^(EXP expression block)
  ;

elseStat
  : ^(EXP block)
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
  |  ^('=_=' expression expression)  
  |  ^('>_<' expression expression)  
  |  ^('>_=' expression expression)  
  |  ^('=_<' expression expression)  
  |  ^('>_>' expression expression)  
  |  ^('<_<' expression expression)  
  |  ^('+' expression expression)  
  |  ^('-' expression expression)  
  |  ^('*' expression expression)  
  |  ^('/' expression expression)  
  |  ^('//' expression expression)  
  |  ^('%' expression expression)  
  |  ^('**' expression expression)  
  |  ^('^' expression expression)  
  |  ^('&' expression expression)  
  |  ^('|' expression expression)  
  |  ^(UNARY_MIN expression)  
  |  ^(NOT expression)  
  |  ^(BIN_NOT expression)  
  |  Number
  |  Bool
  |  Null
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