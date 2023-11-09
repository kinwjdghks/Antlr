grammar Expr;

// parser rules
prog : (addExpr ';' NEWLINE?)*;   

addExpr: multExpr				   
     	| addExpr ('+' | '-') multExpr
     	| var '=' num  
     	;

multExpr: term
		| multExpr ('*' | '/') term
		;


term: num 			   #numTerm
     | '(' addExpr ')' #parenTerm
     | var 			   #varTerm
     ;
     
num  : INT
     | REAL ;
     
var  : VAR;
     
// lexer rules                    
NEWLINE: [\r\n]+ ;
INT: [+-]?[0-9]+ ;
REAL: [+-]?([0-9]+('.'[0-9]*)?|[0-9]*'.'[0-9]+);
WS: [ \t\r\n]+ -> skip ;
VAR: [a-zA-Z_$][a-zA-Z_$0-9]* ;
