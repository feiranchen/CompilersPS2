
public class TimesExpr extends CuExpr{
	private CuExpr data1, data2;
	public TimesExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = data1.toString() + " . * times < > ( " + data2.toString()+" )";
	}
}
