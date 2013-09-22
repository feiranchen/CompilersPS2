
public class MinusExpr extends CuExpr{
	private CuExpr data1, data2;
	public MinusExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = data1.toString() + " . * minus < > ( " + data2.toString()+" )";
	}
}
