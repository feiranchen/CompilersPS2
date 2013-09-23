import java.util.List;

// s=stat ss=stats pr=program {$p = new StatsPrg($s.s, $ss.cu, $pr.p);}
public class StatsPrg extends CuProgr {
	CuStat s;
	List<CuStat> cu; 
	CuProgr p;
	public StatsPrg(CuStat s, List<CuStat> cu, CuProgr p) {
		this.s = s;
		this.cu = cu;
P.p("cu "+cu.toString());
		this.p = p;
P.p("p "+p.toString());
		super.text = String.format("%s %s %s", s.toString(), listStats(cu) + p.toString());
	}
	
	private static String listStats(List<CuStat> es) {
		String s = "";
		for (CuStat e : es) {
			s += e.toString() + " ";
		}
		return s;
	}
}
