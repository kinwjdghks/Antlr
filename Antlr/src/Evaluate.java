
public class Evaluate {
	//Define methods to calculate the expression we get as input
	//The name of the method should be "evaluate"
	public static double evaluate(AstNodes node) {
		
		switch(node.getType()) {
		
		case MUL:
			return evaluate(node.getLeft())*evaluate(node.getRight());
			
		case DIV:
			return evaluate(node.getLeft())/evaluate(node.getRight());
			
		case ADD:
			return evaluate(node.getLeft())+evaluate(node.getRight());
			
		case SUB:
			return evaluate(node.getLeft())-evaluate(node.getRight());
			
		case PAR:
			return evaluate(node.getInner());
			
		case DEC:
			return 0.0;
			
		case NUM:
			return node.getVal();
		
		case VAR:
			String id = node.getId();
			if(AST.isDeclared(id)) {
				return AST.getVARval(id);
			}
			else {
				System.out.print("Variable not declared!");
				return 0.0;
			}
		}
		return 0.0;
		
	}
}