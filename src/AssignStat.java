
public class AssignStat extends CuStat{
	private String var;
	private CuExpr ee;
	public AssignStat (String t, CuExpr e) {
		var = t;
P.p("var" + t);
		ee = e;
P.p("cuexpr" + e.toString());
		super.text = var + " := " + ee.toString() + " ;";
P.p("text "+text);
	}
}
