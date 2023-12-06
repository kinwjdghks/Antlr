import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;


public class BuildAstVisitor extends ExprBaseVisitor<AstNodes>{
	
	@Override
	public AstNodes visitProg(ExprParser.ProgContext ctx) {
		
//		int range = ctx.getChildCount()-2;
//		System.out.printf("childcount:"+range+"\n");
//		int i=0;
//		
//		List<AstNodes>roots = new ArrayList<AstNodes>();
//		if(ctx.declList() != null) {
//			List<AstNodes>declList = ((declListNode)visit(ctx.declList())).declList;
//			for(AstNodes node: declList) {
//				roots.add(node);
//				i++;
//			}
//		}
//		
//		while(i<range) {
//			roots.add(visit(ctx.getChild(i++)));
//		}
		
		List<AstNodes>roots = new ArrayList<AstNodes>();
		if(ctx.declList() != null) {
			List<AstNodes>declList = ((declListNode)visit(ctx.declList())).declList;
			for(AstNodes node: declList) {
				roots.add(node);
			}
		}
		for(int i=0;i<ctx.expr().size();i++) {
			roots.add(visit(ctx.expr(i)));
		}
		
		
		return new ProgNode(roots);
	}

	@Override
	public AstNodes visitDeclList(ExprParser.DeclListContext ctx) {
		List<AstNodes>declList = new ArrayList<AstNodes>();
		for(int i=0;i<ctx.getChildCount();i++) {
			declList.add(visit(ctx.getChild(i)));
		}
		return new declListNode(declList);
	}

	@Override
	public AstNodes visitFunDecl(ExprParser.FunDeclContext ctx) {
		String name = ctx.getChild(1).getText();
		AstNodes body = visit(ctx.expr());
		List<String> param = null;
		if(ctx.varList() != null) {
			param = ((varListNode)visit(ctx.varList())).varList;
		}
		return new funDeclNode(name, body, param);
	}

	@Override
	public AstNodes visitVarList(ExprParser.VarListContext ctx) {
		List<String> varList = new ArrayList<>();
		for(int i=0;i<ctx.getChildCount();i++) {
			varList.add(ctx.getChild(i).getText());
		}		
		return new varListNode(varList);
	}

	@Override
	public AstNodes visitVarExpr(ExprParser.VarExprContext ctx) {
		return new VARNode(ctx.getChild(0).getText());
	}

	@Override
	public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) {
		String op = "";
		switch(ctx.getChild(1).getText()) {
		case "+":
			op = "ADD";
			break;
		case "-":
			op = "SUB";
			break;
		case "*":
			op = "MUL";
			break;
		case "/":
			op = "DIV";
			break;
		}
		return new InfixNode( visit(ctx.getChild(0)) ,visit(ctx.getChild(2)),op);
	}


	@Override
	public AstNodes visitNegExpr(ExprParser.NegExprContext ctx) {
		return new NegNode(visit(ctx.getChild(2)));
	}

	@Override
	public AstNodes visitFunCallExpr(ExprParser.FunCallExprContext ctx) {
		List<AstNodes> param = null;
		if(ctx.exprList() != null) {
			param = ((exprListNode)visit(ctx.exprList())).exprList;
		}
		return new funCallNode(ctx.getChild(0).getText(), param);
	}

	@Override
	public AstNodes visitLetExpr(ExprParser.LetExprContext ctx) {
		return new LetNode(ctx.getChild(1).getText(),visit(ctx.getChild(3)),visit(ctx.getChild(5)));
	}

	@Override
	public AstNodes visitParenExpr(ExprParser.ParenExprContext ctx) {
		return visit(ctx.getChild(1));
	}

	@Override
	public AstNodes visitNumExpr(ExprParser.NumExprContext ctx) {
		return visit(ctx.getChild(0));
	}

	@Override
	public AstNodes visitExprList(ExprParser.ExprListContext ctx) {
		List<AstNodes> exprList = new ArrayList<>();
	    for (ExprParser.ExprContext exprContext : ctx.expr()) {
	        exprList.add(visit(exprContext));
	    }
		return new exprListNode(exprList);
	}

	@Override
	public AstNodes visitNum(ExprParser.NumContext ctx) {
	
		return new NUMNode(Double.parseDouble(ctx.getChild(0).getText()));
	}
	@Override
	public AstNodes visitVarDeclExpr(ExprParser.VarDeclExprContext ctx) {
		return new varDeclNode(ctx.getChild(0).getText(),visit(ctx.getChild(2)));
	}
		
	
}
