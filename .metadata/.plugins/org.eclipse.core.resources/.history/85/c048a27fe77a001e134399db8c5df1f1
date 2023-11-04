grammar Expr;

// parser rules
prog : (decl|expr ';' NEWLINE?)*; 

decl : var '=' num;         

expr : expr ('*'|'/') expr  # infixExpr
     | expr ('+'|'-') expr  # infixExpr 
     | num                  # numberExpr
     | '(' expr ')'         # parensExpr
     ;
     
num  : INT
     | REAL ;
     
var  : VAR;
     
// lexer rules                    
NEWLINE: [\r\n]+ ;
INT: [+-]?[0-9]+ ;
REAL: [+-]?[0-9]+'.'[0-9]* ;
WS: [ \t\r\n]+ -> skip ;
VAR: [a-zA-Z_$][a-zA-Z_$0-9]* ;
