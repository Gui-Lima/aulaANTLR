grammar gui;
goal
:	mainClass classDeclaration* EOF
;


mainClass
:	'class' identifier '{' 'public' 'static' 'Void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';

classDeclaration
:	'class' identifier ( 'extends' identifier )? '{' varDeclaration* methodDeclaration* '}';

varDeclaration
:	type identifier ';';

methodDeclaration
:	'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';

type
:	'int' '[' ']'
|	'boolean'
|	'int'
|	identifier
;


statement:
'{' ( statement )* '}'


|
'if' '(' expression ')' statement 'else' statement


|
'while' '(' expression ')' statement


|
'System.out.println' '(' expression ')' ';'


|
identifier '=' expression ';'


|
identifier '[' expression ']' '=' expression ';'
;



expression
:
expression ( '&&' | '<' | '+' | '-' | '*' ) expression
|
expression '[' expression ']'
|
expression '.' 'length'
|
expression '.' identifier '(' ( expression ( ',' expression )* )? ')'
|
integerLiteral
|
'true'
|
'false'
|
identifier
|
'this'
|
'new' 'int' '[' expression ']'
|
'new' identifier '(' ')'
|
'(' expression ')'
|
'!' expression
;

identifier: IDENTIFIER;
integerLiteral: INTEGER_LITERAL;

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
IDENTIFIER: [_a-zA-Z][_a-zA-Z0-9]*;
INTEGER_LITERAL: [1-9][0-9]* | '0';
WS: [ \t\f\r\n] -> skip;