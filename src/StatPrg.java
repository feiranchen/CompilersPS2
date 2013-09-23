// s=stat {$p = new StatPrg($s.s);} 
public class StatPrg extends CuProgr {
	CuStat s;
	public StatPrg(CuStat s) {
		this.s = s;
		super.text = s.toString();
	}
}
