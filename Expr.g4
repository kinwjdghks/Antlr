grammar Expr;

// parser rules
prog : declList (expr ';' NEWLINE?)*
	   | (expr ';' NEWLINE?)* ;

declList: decl+ ;
		  
decl: 'def' VAR varList '=' expr 'endef'	#funDecl
	 | 'def' VAR '=' expr 'endef'			#funDecl
	 ;
	 
varList : VAR+ ;

expr : expr ('*' | '/') expr		#infixExpr
	 | expr ('+' | '-') expr		#infixExpr
     | 'let' VAR '=' expr 'in' expr #letExpr
     | '(' expr ')'         		#parenExpr
     | '~' '(' expr')'      		#negExpr
     | VAR '()'			    		#funCallExpr
     | VAR '(' exprList ')' 		#funCallExpr
	 | VAR '=' expr					#varDeclExpr
     | num 							#numExpr
     | VAR							#varExpr
     ;
     
exprList : expr (',' expr)* ;
     
num  : INT
     | REAL ;	
     

     
// lexer rules                    
NEWLINE: [\r\n]+ ;
INT: [+-]?[0-9]+ ;
REAL: [+-]?([0-9]+('.'[0-9]*)?|[0-9]*'.'[0-9]+);
WS: [ \t\r\n]+ -> skip ;
VAR: [a-zA-Z_$][a-zA-Z_$0-9]* ;
