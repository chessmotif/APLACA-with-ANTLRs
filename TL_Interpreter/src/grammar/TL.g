grammar TL;

options { 
  output=AST;
}

tokens {
  BLOCK;
  RETURN;
  STATEMENTS;
  ASSIGNMENT;
  IF;
  EXP;
  ID_LIST;
  INDEXES;
  UNARY_MIN;
  NOT;
  BIN_NOT;
  LOOKUP;
  LIST;
  EXP_LIST;
  FUNC_CALL;
}

parse
  :  delimitedBlock EOF
  ;

block
  :  '{' delimitedBlock '}'
  		-> delimitedBlock
  ;

delimitedBlock
  : (statement | functionDecl)* (Return expression ';')?
  		-> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;

statement
  :  assignment ';' -> assignment
  |  functionCall ';' -> functionCall
  |  ifStatement
  ;

ifStatement
  :  ifStat elseIfStat* elseStat? -> ^(IF ifStat elseIfStat* elseStat?)
  ;

ifStat
  :  If expression block -> ^(EXP expression block)
  ;

elseIfStat
  :  Else_If expression block -> ^(EXP expression block)
  |  Else If expression block -> ^(EXP expression block)
  ;

elseStat
  :  Else block -> ^(EXP block)
  ;

functionDecl
  :  Def_Func Identifier '(' idList? ')' block // TBI
  ;

idList
  :  Identifier (',' Identifier)* -> ^(ID_LIST Identifier+)
  ;
 
 assignment
  :  Identifier indexes? '<-' expression
  		-> ^(ASSIGNMENT Identifier indexes? expression)
  ;

indexes
  :  ('[' expression ']')+ -> ^(INDEXES expression+)
  ;
 
 expression
  :  orExpr
  ;

/* FOR IF STATEMENTS
condExpr
  :  orExpr ( ifStatement )?
  ;
*/

orExpr
  :  andExpr ('|_|'^ andExpr)*
  ;

andExpr
  :  bitORExpr ('&_&'^ bitORExpr)*
  ;

bitORExpr
  :  bitXORExpr ('|'^ bitXORExpr)*
  ;

bitXORExpr
  :  bitANDExpr ('^'^ bitANDExpr)*
  ;

bitANDExpr
  :  equExpr ('&'^ equExpr)*
  ;

equExpr
  :  relExpr (('=_=' | '>_<')^ relExpr)*
  ;

relExpr
  :  addExpr (('>_=' | '=_<' | '>_>' | '<_<')^ addExpr)*
  ;

addExpr
  :  mulExpr (('+' | '-')^ mulExpr)*
  ;

mulExpr
  :  powExpr (('*' | '/' | '%' | '//')^ powExpr)*
  ;

powExpr
  :  unaryExpr ('**'^ unaryExpr)*
  ;
  
unaryExpr
  :  '-' atom -> ^(UNARY_MIN atom)
  |  '!' atom -> ^(NOT atom)
  |  '~' atom -> ^(BIN_NOT atom)
  |  atom
  ;

atom
  :  Null
  |  Number
  |  Bool
  |  lookup
  ;
 
lookup
  :  functionCall indexes?			-> ^(LOOKUP functionCall indexes?)
  |  '(' expression ')' indexes?	-> ^(LOOKUP expression indexes?)
  |  list indexes?					-> ^(LOOKUP list indexes?)
  |  Identifier indexes?			-> ^(LOOKUP Identifier indexes?)
  |  String indexes?				-> ^(LOOKUP String indexes?)
  ;

list
  :  '[' exprList? ']' -> ^(LIST exprList?)
  ;

exprList
  :  expression (',' expression)* -> ^(EXP_LIST expression+)
  ;

functionCall
  :  Identifier '(' exprList? ')' -> ^(FUNC_CALL Identifier exprList?)
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
