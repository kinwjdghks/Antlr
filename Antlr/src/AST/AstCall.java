package AST;

public class AstCall {
	
	public static void Call(AstNodes node, int depth) {
		
		for(int i=0;i<depth;i++) {System.out.print("\t");}
		
		AstNodes.TYPE type = node.getType();
		switch(type) {
		
		case MUL:
			System.out.print("MUL\n");
			Call(node.getLeft(),++depth);
			Call(node.getRight(),depth--);
			break;
		case DIV:
			System.out.print("MUL\n");
			Call(node.getLeft(),++depth);
			Call(node.getRight(),depth--);
			break;
		case ADD:
			System.out.print("ADD\n");
			Call(node.getLeft(),++depth);
			Call(node.getRight(),depth--);
			break;
		case SUB:
			System.out.print("SUB\n");
			Call(node.getLeft(),++depth);
			Call(node.getRight(),depth--);
			break;
		case PAR:
			Call(node.getInner(),depth);
			break;
		case DEC:
			System.out.print("ASSIGN\n");
			Call(node.getLeft(),++depth);
			Call(node.getRight(),depth--);
			break;
		case NUM:
			System.out.printf("%.1f\n",Evaluate.evaluate(node));
			break;
		case VAR:
			System.out.printf("%s\n",node.getId());
			break;
			
		}
		
	}
}
