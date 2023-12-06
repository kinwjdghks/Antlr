import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AstNodes{}

class ProgNode extends AstNodes {
	public List<AstNodes>roots = new ArrayList<AstNodes>();
	
	ProgNode(List<AstNodes>roots){
		this.roots = roots;
	};
} //list of decl and expr

class declListNode extends AstNodes {
	List<AstNodes> declList;
	declListNode(List<AstNodes> declList){
		this.declList = declList; 
	}
	
}

class funDeclNode extends AstNodes {
	String name;
	AstNodes body;
	List<String>param;
	funDeclNode(String name,AstNodes body, List<String> param){
		this.name = name;
		this.body = body;
		this.param = param;
	}
	
}

class varListNode extends AstNodes{
	List<String>varList;
	varListNode(List<String> varList){
		this.varList = varList;
	}
}

class exprListNode extends AstNodes{
	List<AstNodes> exprList;
	exprListNode(List<AstNodes> exprList){
		this.exprList = exprList;
	}
	
}

class InfixNode extends AstNodes {
	AstNodes LHS;
	AstNodes RHS;
	String op;
	InfixNode(AstNodes LHS,AstNodes RHS,String op){
		this.LHS = LHS;
		this.RHS = RHS;
		this.op = op;
	}
}

class funCallNode extends AstNodes {
	String name;
	List<AstNodes> param;
	funCallNode(String name,List<AstNodes> param){
		this.name = name;
		this.param = param;
	}
}

class LetNode extends AstNodes{
	String var;
	AstNodes body;
	AstNodes expr;
	LetNode(String var, AstNodes body, AstNodes expr){
		this.var = var;
		this.body = body;
		this.expr = expr;
	}
}

class NegNode extends AstNodes {
	AstNodes body;
	NegNode(AstNodes body){
		this.body = body;
	}
}// ~(expr)

class ParenNode extends AstNodes{
	AstNodes body;
	ParenNode(AstNodes body){
		this.body = body;
	}
}

class NUMNode extends AstNodes {
	double value;
	NUMNode(double value){
		this.value = value;
	}
}// number

class VARNode extends AstNodes {
	String ID;
	VARNode(String ID){
		this.ID = ID;
	}
}// var
class varDeclNode extends AstNodes{
	String name;
	AstNodes body;
	varDeclNode(String name, AstNodes body){
		this.name = name;
		this.body = body;
	}
	
}











