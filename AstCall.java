
public class AstCall {
	
	public static void Call(AstNodes node, int depth) {
		Evaluate Evaluator = new Evaluate();
		for(int i=0;i<depth;i++) {System.out.print("\t");}
		
		if(node instanceof InfixNode) {
			String op = ((InfixNode) node).op;
			AstNodes LHS = ((InfixNode) node).LHS;
			AstNodes RHS = ((InfixNode) node).RHS;
			System.out.printf("%s\n",op);
			
			Call(LHS,++depth);
			Call(RHS,depth--);
			
		}
		else if(node instanceof funDeclNode) {
			funDeclNode Node = (funDeclNode)node;
			System.out.print("DECL\n");
			
			Call(new VARNode(Node.name),++depth);			
			if(Node.param != null) {
				for(String s : Node.param) {
					Call(new VARNode(s),depth);
				}
			}
			Call(Node.body,depth--);
			
		}

		else if(node instanceof funCallNode) {
			funCallNode Node = (funCallNode)node;
			System.out.print("CAll\n");
			Call(new VARNode(Node.name),depth+1);
			if(Node.param != null) {
				for(AstNodes s :Node.param) {
					Call(s,depth+1);
				}
			}
		}
		
		else if(node instanceof LetNode) {
			LetNode Node = (LetNode)node;
			System.out.print("LETIN\n");
			Call(new VARNode(Node.var),++depth);
			Call(Node.body,depth);
			Call(Node.expr,depth--);
			
		}
		else if(node instanceof NegNode) {
			AstNodes body = ((NegNode) node).body;
			System.out.print("NEGATE\n");
			Call(body,depth+1);
		}
		else if(node instanceof ParenNode) {
			AstNodes body = ((ParenNode) node).body;
			Call(body,depth);
		}
		else if(node instanceof VARNode) {
			VARNode Node = (VARNode)node;
			System.out.printf("%s\n",Node.ID);
		}
		else if(node instanceof NUMNode) {
			System.out.printf("%.1f\n", Evaluator.evaluate(node));
		}

		else if(node instanceof varDeclNode) {
			varDeclNode Node = (varDeclNode)node;
			System.out.print("ASSIGN\n");
			Call(new VARNode(Node.name),++depth);
			Call(Node.body,depth--);
			
		}
		else return;
	}
			
			
}
