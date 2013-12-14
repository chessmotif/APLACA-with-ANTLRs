tree grammar TLTreeWalker;

options {
  tokenVocab=TL;
  ASTLabelType=CommonTree;
}

walk
  :  delimitedBlock
  ;

block
  :  delimitedBlock
  ;

delimitedBlock
  : ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;
  
statement
  : assignment
  | functionCall
  | ifStatement
  ;

functionCall  
  :  ^(FUNC_CALL Identifier exprList?)  
  ;

ifStatement
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
  
idList
  : ^(ID_LIST Identifier+)
  ;
  
assignment
  : ^(ASSIGNMENT Identifier indexes? expression)
  ;

indexes
  : ^(INDEXES expression+)
  ;
  
exprList  
  :  ^(EXP_LIST expression+)  
  ;
  
expression  
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
  |  lookup             
  ;
  
list  
  :  ^(LIST exprList?)  
  ;  
  
lookup  
  :  ^(LOOKUP functionCall indexes?)  
  |  ^(LOOKUP list indexes?)  
  |  ^(LOOKUP expression indexes?)   
  |  ^(LOOKUP Identifier indexes?)  
  |  ^(LOOKUP String indexes?)  
  ;    