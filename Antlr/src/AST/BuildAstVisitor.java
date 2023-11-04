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
	
	public AstNodes visitDecl(ExprParser.DeclContext ctx) {
//		String varName = ctx.getChild(0).getText();
//		Double varVal = Double.parseDouble(ctx.getChild(2).getText());
		return new AstNodes(AstNodes.TYPE.DEC,visit(ctx.getChild(0)),visit(ctx.getChild(2))); 
	}
	
	public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) {
		String type_s = ctx.getChild(1).getText();
		AstNodes.TYPE type = null;
		switch (type_s){
		case "*": 
			type = AstNodes.TYPE.MUL;
			break;
		case "/": 
			type = AstNodes.TYPE.DIV;
			break;
		case "+": 
			type = AstNodes.TYPE.ADD;
			break;
		case "-": 
			type = AstNodes.TYPE.SUB;
			break;
		}
		return new AstNodes(type, visit(ctx.getChild(0)), visit(ctx.getChild(2)));
				
	}
	
	public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) {
		
		return new AstNodes(Double.parseDouble(ctx.getChild(0).getText()));
	}
	
	public AstNodes visitParensExpr(ExprParser.ParensExprContext ctx) {

		return visit(ctx.getChild(1));
	}
	
}
