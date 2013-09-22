
public class NegativeExpr extends CuExpr{
	private CuExpr data;
	public NegativeExpr(CuExpr e) {
		data = e;
		super.text = data.toString() + " . negative < > ( )";
	}
}
