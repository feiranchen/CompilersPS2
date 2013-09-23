import java.util.ArrayList;
import java.util.List;


public class ClassCtxtIntf extends CuClassC {
	CuClassC c;
	String clsintf;
	List<String> kc;
	CuType t;
	List<String> VvTypeScheme = new ArrayList<String>(); // temporal
//	cl=clsctxt COMMA INTERFACE CLSINTF p=kindcontext {$c = new ClassCtxtIntf($cl.c, $CLSINTF.text, $p.kc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (VAR ts=typescheme SEMICOLON {$c.add($VAR.text, $ts.ts);})* RBRACE)? 
	public ClassCtxtIntf(CuClassC c, String ci, List<String> kc) {
		this.c = c;
		this.clsintf = ci;
		this.kc = kc;
	}
	
	public void add (CuType t) {
		this.t = t;
	}
	
	public void add (String vv, CuTypeScheme ts) {
		String s = String.format("%s %s ;", vv, ts.toString());
		VvTypeScheme.add(s);
	}
	
	@Override public String toString() {
		return String.format("%s , interface %s %s extends %s %s", c.toString(), clsintf, listKC(kc), t.toString(), listVvTypeScheme(VvTypeScheme));
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
