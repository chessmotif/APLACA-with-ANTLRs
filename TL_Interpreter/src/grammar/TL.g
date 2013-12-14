grammar TL;

parse
  :  delimitedBlock EOF
  ;

block
  :  '{' delimitedBlock '}'
  ;

delimitedBlock
  : (statement | functionDecl)* (Return expression ';')?
  ;

statement
  :  assignment ';'
  |  functionCall ';'
  |  ifStatement
  ;

functionDecl
  :  Def_Func Identifier '(' idList? ')' block
  ;

idList
  :  Identifier (',' Identifier)*
  ;
 
 assignment
  :  Identifier indexes? '<-' expression
  ;

indexes
  :  ('[' expression ']')+
  ;
 
 expression
  :  orExpr
  ;

/*
condExpr
  :  orExpr ( ifStatement )?
  ;
*/

orExpr
  :  andExpr ('||' andExpr)*
  ;

andExpr
  :  equExpr ('&&' equExpr)*
  ;

equExpr
  :  relExpr (('=_=' | '>_<') relExpr)*
  ;

relExpr
  :  addExpr (('>_=' | '=_<' | '>_>' | '<_<') addExpr)*
  ;

addExpr
  :  mulExpr (('+' | '-') mulExpr)*
  ;

mulExpr
  :  powExpr (('*' | '/' | '%' | '//') powExpr)*
  ;

powExpr
  :  unaryExpr ('**' unaryExpr)*
  ;
  
unaryExpr
  :  '-' atom
  |  '!' atom
  |  '~' atom
  |  atom
  ;
  
  /*
parenExpr
  :  '(' atom ')'
  |  atom
  ;
*/

atom
  :  Null
  |  Number
  |  Bool
  |  lookup
  ;
 
lookup
  :  functionCall indexes?
  |  '(' expression ')' indexes?
  |  list indexes?
  |  Identifier indexes?
  |  String indexes?
  ;

list
  :  '[' exprList? ']'
  ;

exprList
  :  expression (',' expression)*
  ;

functionCall
  :  Identifier '(' exprList? ')'
  ;
 
ifStatement
  :  ifStat elseIfStat* elseStat?
  ;

ifStat
  :  If expression block
  ;

elseIfStat
  :  Else If expression block
  ;

elseStat
  :  Else block
  ;

Def_Func		: 'func';
If				: 'if';
Else_If			: 'fiif';
Else			: 'fi';
Return			: 'return';
Out				: 'out';
In				: 'in';
Null			: 'null';

Or				: '|_|';
And				: '&_&';
Equals			: '=_=';
NEquals			: '>_<';
GTEquals		: '>_=';
LTEquals		: '=_<';
GT				: '>_>';
LT				: '<_<';
Not				: '!';

Pow				: '**';
Add				: '+';
Subt			: '-';
Mult			: '*';
Int_Div			: '//';
Div				: '/';
Mod				: '%';
Bit_Or			: '|';
Bit_And			: '&';
Bit_Xor			: '^';
Bit_Not			: '~';

Gets			: '<-';
Comma			: ',';

Open_Paren		: '(';
Close_Paren		: ')';
Open_Bracket	: '[';
Close_Bracket	: ']';
Open_Brace		: '{';
Close_Brace		: '}';

Bool
  :  'true' 
  |  'false'
  ;

Number
  :  Int ('.' Digit*)?
  ;

Identifier
  :  ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | Digit)*
  ;

String
@after {
  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
}
  :  '\'' (~('\'' | '\\') | '\\' .)* '\'' 
  ;

Comment
  :  '//' ~('\r' | '\n')* {skip();}
  |  '/*' .* '*/'         {skip();}
  ;

Space
  :  (' ' | '\t' | '\r' | '\n' | '\u000C') {skip();}
  ;

fragment Int
  :  '1'..'9' Digit*
  |  '0'
  ;
  
fragment Digit 
  :  '0'..'9'
  ;
