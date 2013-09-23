import java.util.ArrayList;
import java.util.List;

// s=stat {$p = new StatPrg($s.s);} 
public class StatPrg extends CuProgr {
	CuStat s;
	public StatPrg(CuStat s) {
		this.s = s;
		super.text = s.toString();
	}
	
	@Override public void add(List<CuStat> cu, CuProgr p) {
		text += listFlatten(cu) + " "+ p.toString();
	}
	
	private String listFlatten(List<CuStat> cs) {
		String s="";
		if (cs == null || cs.size() == 0) return s;
		for (CuStat t : cs) {
			if (t instanceof Stats) s+=listFlatten((ArrayList<CuStat>) ((Stats)t).al);
			else s+= t.toString() + " ";
		}
		return s;
	}
}
