// Mon Dec 13 16:37:18 EST 2021
//
// equivalent in running following command
//
// grun ArrayInit -init tree

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
  public static void main(String[] args) throws Exception {
    // commandline input --> raw input
    ANTLRInputStream input = new ANTLRInputStream(System.in);

    // raw input --> | lexer |
    ArrayInitLexer lexer = new ArrayInitLexer(input);

    // | lexer | --> tokens
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    // tokens --> | parser |
    ArrayInitParser parser = new ArrayInitParser(tokens);

    // | parser | --> parse tree
    ParseTree tree = parser.init();

    System.out.println(tree.toStringTree(parser));
    // tree
  }
}

