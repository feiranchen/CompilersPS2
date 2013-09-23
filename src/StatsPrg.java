import java.util.List;

// s=stat ss=stats pr=program {$p = new StatsPrg($s.s, $ss.cu, $pr.p);}
public class StatsPrg extends CuProgr {
	CuStat s;
	List<CuStat> cu; 
	CuProgr p;
	public StatsPrg(CuStat s, List<CuStat> cu, CuProgr p) {
System.out.println("p " +p.toString());
System.out.println("cu " +cu.toString());
System.out.println("s " +s.toString());
		this.s = s;
		this.cu = cu;
		this.p = p;
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
