import java.util.List;

public class BrkExpr extends CuExpr {
	private List<CuExpr> data_es;
	public BrkExpr(List<CuExpr> es){
		super.text=printLst(es);
	}
	
	private String printLst(List<CuExpr> es) {
		String s = "[ ";
		for (CuExpr e : es) {
			s += e.toString() + " , ";
		}
		int l = s.lastIndexOf(", ");
		if (l > 0) s = s.substring(0, l);
		s += "]";
		return s;
	}
}
