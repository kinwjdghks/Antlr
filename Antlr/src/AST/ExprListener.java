// Generated from Expr.g4 by ANTLR 4.13.1
package AST;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNumTerm(ExprParser.NumTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNumTerm(ExprParser.NumTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParenTerm(ExprParser.ParenTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParenTerm(ExprParser.ParenTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVarTerm(ExprParser.VarTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVarTerm(ExprParser.VarTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ExprParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ExprParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExprParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExprParser.VarContext ctx);
}