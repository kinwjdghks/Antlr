package AST;

public class BuildAstVisitor extends ExprBaseVisitor<AstNodes>{
	//Build AST using ExprBaseVisitor.java

	public AstNodes visitProg(ExprParser.ProgContext ctx) {
		//visit all the nodes in the prog ctx and add AST nodes
		AstNodes nodes = new AstNodes();
		for(int i=0;i<ctx.getChildCount()-1;i++) {
			nodes.addRoot(visit(ctx.getChild(i)));
		}
		return nodes;
		
	}

	
	public AstNodes visitAddExpr(ExprParser.AddExprContext ctx) {
		if (ctx.getChildCount() >= 3 && ctx.getChild(0) != null && ctx.getChild(2) != null) {
			String type_s = ctx.getChild(1).getText();
			AstNodes.TYPE type = null;
			switch (type_s){
			case "+": 
				type = AstNodes.TYPE.ADD;
				break;
			case "-": 
				type = AstNodes.TYPE.SUB;
				break;
			case "=":
				type = AstNodes.TYPE.DEC;
				break;
			}
			return new AstNodes(type, visit(ctx.getChild(0)), visit(ctx.getChild(2)));
		}
		else return visit(ctx.getChild(0)); 
		
	}
	
	public AstNodes visitMultExpr(ExprParser.MultExprContext ctx) {
		if (ctx.getChildCount() >= 3 && ctx.getChild(0) != null && ctx.getChild(2) != null) {
			String type_s = ctx.getChild(1).getText();
			AstNodes.TYPE type = null;
			switch (type_s){
			case "*": 
				type = AstNodes.TYPE.MUL;
				break;
			case "/": 
				type = AstNodes.TYPE.DIV;
				break;
			}
			return new AstNodes(type, visit(ctx.getChild(0)), visit(ctx.getChild(2)));
		}
		else return visit(ctx.getChild(0)); 
				
	}
	
	public AstNodes visitNumTerm(ExprParser.NumTermContext ctx) {
		return new AstNodes(Double.parseDouble(ctx.getChild(0).getText()));
	}
	
	public AstNodes visitParenTerm(ExprParser.ParenTermContext ctx) {
		return visit(ctx.getChild(1));
	}
	
	public AstNodes visitVarTerm(ExprParser.VarTermContext ctx) {
		return visit(ctx.getChild(0));
	}
	
	public AstNodes visitNum(ExprParser.NumContext ctx) {
		return new AstNodes(Double.parseDouble(ctx.getChild(0).getText()));
	}
	
	public AstNodes visitVar(ExprParser.VarContext ctx) {
		String id = ctx.getChild(0).getText();
		return new AstNodes(id);
	}
	
}
