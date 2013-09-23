import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Cubex {
	public static void main (String args[]) throws IOException {
		getLexer(args[0]);
	}
	
	protected static void getLexer(String fn) throws IOException {
		CubexLexer lexer = new CubexLexer(new ANTLRFileStream(fn));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CubexParser parser = new CubexParser(tokens);
		//parser.setBuildParseTree(true);
		//RuleContext tree = parser.vv();
		System.out.println(parser.program().p.toString());
		
		//RuleContext tree = parser.fundef();
		//tree.inspect(parser); // show in gui
		//tree.save(parser, "/tmp/R.ps"); // Generate postscript
		//System.out.println(tree.toString());

		//System.out.println(tree.toStringTree(parser));
	}
}
