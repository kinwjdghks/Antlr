
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Evaluate {
	//Define methods to calculate the expression we get as input
	//The name of the method should be "evaluate"
	static  Map<String, Double> store = new HashMap<>();
    static  Map<String, funDeclNode> fstore = new HashMap<>();
    static  List<String>errors = new ArrayList<>();


	
	public double evaluate(AstNodes node) {
		
		
		if(node instanceof InfixNode) {
			String op = ((InfixNode) node).op;
			AstNodes LHS = ((InfixNode) node).LHS;
			AstNodes RHS = ((InfixNode) node).RHS;
			switch(op) {
			case "ADD":
				return evaluate(LHS)+evaluate(RHS);
			case "SUB":
				return evaluate(LHS)-evaluate(RHS);
			case "MUL":
				return evaluate(LHS)*evaluate(RHS);
			case "DIV":
				return evaluate(LHS)/evaluate(RHS);
				
			}
		}
		else if(node instanceof funDeclNode) {
			funDeclNode Node = (funDeclNode)node;
			
			String name = Node.name;
			fstore.put(name,Node);
			
			Map<String, Double> backup = new HashMap<>(store);	
			Map<String, Double> closure = new HashMap<>(store);
			if( Node.param != null){	
			for(String p: Node.param) {
				closure.put(p, 0.0);
			}
}
			store = closure;
			evaluate(Node.body);
			store = backup;
		}

		else if(node instanceof funCallNode) {
			funCallNode Node = (funCallNode)node;
			String functionName = Node.name;
			//undefined function error handling

			List<AstNodes>param = Node.param;
			if(param != null){
				for(AstNodes n: param){
					evaluate(n);
				}
			}		
			
			if(!fstore.containsKey(functionName)) {
				errors.add("Undefined function "+functionName+" detected.");
				return 0.0;
			}
			
			List<String>fparam = fstore.get(functionName).param;
			AstNodes functionBody = fstore.get(functionName).body;
			
			//function call with arguments
			if(fparam != null && param ==null){
				
				errors.add("The number of arguments of "+functionName+" mismatched, Required: "+fparam.size()+", Actual: 0");
					return 0.0;
			}

			if(fparam == null && param !=null){
				
				errors.add("The number of arguments of "+functionName+" mismatched, Required: 0, Actual: "+param.size());
					return 0.0;
			}
			if(fparam != null && param != null){
				if(fparam.size() != param.size()){

				errors.add("The number of arguments of "+functionName+" mismatched, Required: "+fparam.size()+", Actual: "+param.size());
					return 0.0;
				}
			}

			Map<String, Double> backup = new HashMap<>(store);
			Map<String, Double> closure = new HashMap<>(store);

			if(fparam != null) {
				for(int i=0;i<fparam.size();i++) {
					String key = fparam.get(i);
					double val = evaluate(param.get(i));
					closure.put(key, val);
				}
			}
			store = closure;	
			double result = evaluate(functionBody);
			store = backup;
			return result;
		}
		
		else if(node instanceof LetNode) {

			LetNode Node = (LetNode)node;
			Double backup = store.get(Node.var);
			
			String key = Node.var;
			double val = evaluate(Node.body);
			store.put(key,val);
			double result = evaluate(Node.expr);
			if(backup != null) {
				store.put(Node.var, backup);
			}
			else{
				store.remove(Node.var);
			}
			return result;
		}
		else if(node instanceof NegNode) {
			AstNodes body = ((NegNode) node).body;
			return -1 * evaluate(body);
		}
		else if(node instanceof ParenNode) {
			AstNodes body = ((ParenNode) node).body;
			return evaluate(body);
		}
		else if(node instanceof VARNode) {
			 VARNode Node = (VARNode)node;
			if(!store.containsKey(Node.ID)) {
				errors.add("Free identifier "+ Node.ID+" detected");
				return 0.0;
			}
			return store.get(Node.ID);
			
		}
		else if(node instanceof NUMNode) {
			return ((NUMNode)node).value;
		}

		else if(node instanceof varDeclNode) {
			String name = ((varDeclNode)node).name;
			AstNodes body = ((varDeclNode)node).body;
			double val = evaluate(body);
			store.put(name, val);
			return 0.0;
		}
		return 0.0;
		
		
	}
}
