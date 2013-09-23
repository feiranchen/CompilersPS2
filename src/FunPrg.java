import java.util.ArrayList;
import java.util.List;

// FUN VAR ts=typescheme s=stat {$p = new FunPrg($VAR.text, $ts.ts, $s.s);} 
// (FUN VAR ts=typescheme s=stat {$p.add($VAR.text, $ts.ts, $s.s);})* pr=program {$p.add($pr.p);}
public class FunPrg extends CuProgr {
	List<String> fun = new ArrayList<String>(); // need to change
	CuProgr p;
	
	public FunPrg(String var, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", var, ts.toString(), s.toString());
		fun.add(t);
	}
	
	@Override public void add (String var, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", var, ts.toString(), s.toString());
		fun.add(t);
	}
	@Override public void add (CuProgr p) {
		this.p = p;
	}
	
	private static String listStrings(List<String> es) {
		String s = "";
		for (String e : es) {
			s += e.toString() + " ";
		}
		return s;
	}
	
	@Override public String toString() {
		return listStrings(fun) + " " + p.toString();
	}
}
