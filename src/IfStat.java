
public class IfStat extends CuStat{
	private String name;
	private CuExpr e;
	private CuStat s1;
	private CuStat s2;
	public IfStat (CuExpr ex, CuStat st) {
		e = ex;
		s1 = st;
		name = "if ( " + ex.toString() + " ) " + st.toString();
	}
    public String toString() {
    	return name;
    }
    public void add (CuStat st) {
    	s2 = st;
    	name += " else " + st.toString();
    }
}
