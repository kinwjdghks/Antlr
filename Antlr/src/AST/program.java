package AST;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.*;
public class program {

    public static void main(String[] args) throws IOException {
        // Get Lexer
        ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass tokens to parser
        ExprParser parser = new ExprParser(tokens);
        
        //debugging codes 
//        List<Token> tokenList = tokens.getTokens();
//        System.out.printf("Num of Tokens: %d\n",tokenList.size());
        //debugging codes
        
        
       
        // Make AST from prog and print the tree
        
        ExprParser.ProgContext ctx = parser.prog();
        AstNodes node = (AstNodes)new BuildAstVisitor().visitProg(ctx);
        node.getRoots().forEach(root -> AstCall.Call(root, 0));
        
        // Evaluate AST result
        node.getRoots().forEach(root -> System.out.println(Evaluate.evaluate(root)));
    }
}