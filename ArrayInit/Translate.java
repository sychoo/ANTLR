// Mon Dec 13 17:03:57 EST 2021

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {
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

    // parse tree --> | tree walker |
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new ShortToUnicodeString(), tree);

    System.out.println();
  }
}

