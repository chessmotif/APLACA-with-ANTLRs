package tl;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.StringTemplate;

public class Main {
  public static void main(String[] args) throws Exception {
    // create an instance of the lexer
    TLLexer lexer = new TLLexer(new ANTLRFileStream("test.tl"));
        
    // wrap a token-stream around the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
        
    // create the parser
    TLParser parser = new TLParser(tokens);
    
    // walk the tree
    CommonTree tree = (CommonTree)parser.parse().getTree();
   
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    
    TLTreeWalker walker = new TLTreeWalker(nodes,parser.functions);  
   
    TLNode returned = walker.walk();  
    System.out.println(returned == null ? "null" : returned.evaluate());

    // print nodes
    DOTTreeGenerator gen = new DOTTreeGenerator();  
    StringTemplate str = gen.toDOT(tree);  
    System.out.println(str);
  }
}
