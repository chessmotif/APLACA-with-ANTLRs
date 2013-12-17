=======================================
====CSC617M INTERPRETER README FILE====
=======================================
>>>>>>>PROJECT INFORMATION<<<<<<<
This project is an interpreter using Java and ANTLR for a simple custom programming language.

>>>>>>>LANGUAGE DESCRIPTION<<<<<<<
This language is called APLACA (A Programming Language Almost Called Alpaca).
The syntax of APLACA is as follows:

---OPERATORS---

Arithmetic:
Addition: x + y
Subtraction: x - y
Multiplication: x * y
Division: x / y
Integer division: x // y
Modulo: x % y
Exponent: x ** y

x | y - bitwise or
x & y - bitwise and
x ^ y - bitwise xor
~x -bitwise not

Relational:
x =_= y - equal to
x =_< y - less than or equal
x <_< y - less than
x >_= y - greater than or equal
x >_> y - greater than
x >_< y - not equal to

Logic:
x &_& y - and
x |_| y - or
x ^_^ y - xor
!x - not

Assignment:
var <- (exp)
example:
x <- (+ 9 5)

String concatenation:
x # y (where x and y are strings)

---DATA TYPES---
bool:
true
false

number: 
1
1.43

string:
'hello'
'a'

null:
null

---VARIABLES---
Identifiers must start with any letter or an underscore, and contain only alphanumeric characters and underscores.

Example: _employees
	second_type
	figure9

---CONDITIONALS---

If statements:

if x =_= y{
	something;
}
fiif x <_< y{
	 somethingelse;
}
fi{
	defaultsomething;
}

APLACA contains no iterative statements; recursion is used instead.

---FUNCTIONS---

Function declaration:

func func_name (param1 param2...) {
	statement;
	return var; ##non-recursive, optional
}

Function call:

funcname(a,b);

---INPUT/OUTPUT---
x <- in # 'hi'
out <- x + 5

---COMMENTS---
Single line: ##this is a comment
Multi-line: /* this is also
		a comment*/

>>>>>>>RESOURCES AND TOOLS USED<<<<<<<
The APLACA interpreter makes use of ANTLR 3.2. It also includes code based on code snippets from the tutorial "Creating your own programming language with ANTLR", by Bart Kiers.
The following resources were referred to in the making of this project:

	Niemann, T. Lex and Yacc Tutorial. Retrieved from http://epaperpress.com/lexandyacc/

	Kiers, B. Creating your own programming language with ANTLR. Retrieved from http://bkiers.blogspot.com/2011/03/creating-your-own-programming-language.html.


>>>>>>>TARGET PLATFORM<<<<<<<
APLACA interprets to Java code, so it should be capable of running on any system which can run Java 6 or later.

>>>>>>>KNOWN PROBLEMS<<<<<<<
Loops do not work properly.
Recursion only works on void functions.
Newlines cannot be printed.

>>>>>>>MISCELLANEOUS INFORMATION<<<<<<<
This text file was created using state-of-the-art Notepad technology.