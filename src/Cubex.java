import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Cubex {
	public static void main (String args[]) throws IOException {
		getLexer(args[0]);
		try {
//			tree(args[0]);
		} catch (Exception e) {
			System.out.println("parser error");
		}
	}
	
	protected static void tree(String fn) throws IOException {
		CubexLexer2 lexer = new CubexLexer2(new ANTLRFileStream(fn));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CubexParser2 parser = new CubexParser2(tokens);
		parser.setBuildParseTree(true);
		RuleContext tree = parser.top();
		tree.inspect(parser); // show in gui
	}
	
	protected static void getLexer(String fn) throws IOException {
		CubexLexer2 lexer = new CubexLexer2(new ANTLRFileStream(fn));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CubexParser2 parser = new CubexParser2(tokens);
		try {
			System.out.println(parser.top().cu.toString());
		} catch (Exception e) {
			System.out.println("parser error");
		}
	}
}
