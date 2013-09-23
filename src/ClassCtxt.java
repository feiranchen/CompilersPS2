import java.util.ArrayList;
import java.util.List;

//{$c = new ClassCtxt();} (COMMA k=(INTERFACE | CLASS) CLSINTF p=kindcontext {$c.add($k.text, $p.kc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (VAR ts=typescheme SEMICOLON {$c.add($VAR.text, $ts.ts);})* RBRACE)?)*;

public class ClassCtxt extends CuClassC {
	String clsintf, keyword;
	List<String> kc;
	CuType t;
	List<String> VvTypeScheme = new ArrayList<String>(); // temporal
	public ClassCtxt() {}
	
	@Override public void add(String k, String ci, List<String> kc) {
		this.keyword = k;
		this.clsintf = ci;
		this.kc = kc;
		text += String.format(" , %s %s %s extends", keyword, clsintf, listKC(kc));
	}
	
	@Override public void add (CuType t) {
		this.t = t;
		text += " " +t.toString();
	}
	
	@Override public void add (String vv, CuTypeScheme ts) {
		String s = String.format("%s %s ;", vv, ts.toString());
		VvTypeScheme.add(s);
		text +=  " " +listVvTypeScheme(VvTypeScheme);
	}
	
	private String listKC(List<String> es) {
		String s = "< ";
		for (String e : es) {
			s += e.toString() + " , ";
		}
		int l = s.lastIndexOf(", ");
		if (l > 0) s = s.substring(0, l);
		s += ">";
		return s;
	}
	
	private String listVvTypeScheme(List<String> es) {
		String s = "{ ";
		for (String e : es) {
			s += e.toString() + " ; ";
		}
		s += "}";
		return s;
	}
	
}
