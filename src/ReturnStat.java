
public class ReturnStat extends CuStat{
	private CuExpr e;
	public ReturnStat (CuExpr ee) {
		e = ee;
	}
	public String toString() {
		return "return " + e.toString();
	}
}
