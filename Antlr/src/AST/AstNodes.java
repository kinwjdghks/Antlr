package AST;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AstNodes {
	//define AST nodes to print
	//The nodes have to defined as class
	public enum TYPE { MUL, DIV, ADD, SUB, PAR, DEC, NUM, VAR }; 
	
	public AstNodes(int val) { //NUM
		this.type = TYPE.NUM;
		this.val = (double)val;
	}
	public AstNodes(double val) { //NUM
		this.type = TYPE.NUM;
		this.val = val;
	}
	public AstNodes(String id) { //VAR
		this.type = TYPE.VAR;
		this.id = id;
	}
	public AstNodes(AstNodes.TYPE type, AstNodes left, AstNodes right) { //INFIX, DEC
		this.type = type;
		this.Left = left;
		this.Right = right;
	}
	public AstNodes(AstNodes inner) { //PAR
		this.type = TYPE.PAR;
		this.Inner = inner;
	}
	public AstNodes() {
		this.roots = new ArrayList<AstNodes>(); 
	}
	
	public void addRoot(AstNodes node) {
		if(node != null) {
			this.roots.add(node);
		}
	}
	
	public static boolean isDeclared(String id) {
		return env.containsKey(id);
	}
	public static double getVARval(String id) {
		return env.get(id);
	}
	public static void declare(String id, Double val) {
		env.put(id, val);
	}
	
	public void addNode(AstNodes node) {
		if(node != null) {
			this.roots.add(node);
		}
	}
	
	private AstNodes.TYPE type;
	private String id;
	private Double val;
	private AstNodes Left;
	private AstNodes Right;
	private AstNodes Inner;
	private ArrayList<AstNodes> roots; //for the very root node.
	public static Map<String,Double> env = new HashMap<String,Double>();

	
	public AstNodes getLeft() { return Left; }
	public AstNodes getRight() { return Right; }
	public AstNodes getInner() { return Inner; }
	public AstNodes.TYPE getType() { return type; }
	public String getId() { return id; }
	public Double getVal() { return val; }
	public ArrayList<AstNodes> getRoots() {return roots;}


	
}
