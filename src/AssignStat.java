
public class AssignStat extends CuStat{
	private String var;
	private CuExpr ee;
	public AssignStat (String text, CuExpr e) {
		var = text;
		ee = e;
	}
	public String toString() {
		String name;
		name = var + " := " + ee.toString();
		return name;
	}
}
