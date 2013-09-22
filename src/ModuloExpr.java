
public class ModuloExpr extends CuExpr{
	private CuExpr data1, data2;
	public ModuloExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = data1.toString() + " . * modulo < > ( " + data2.toString()+" )";
	}
}
