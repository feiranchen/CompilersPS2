import java.util.List;


public class VarExpr extends CuExpr{
	private CuExpr e;
	private String var;
	private List<CuType> pt;
	List<CuExpr> es;
	public VarExpr(CuExpr e, String var, List<CuType> pt, List<CuExpr> es) {
		this.e = e;
		P.p("e"+e.toString());
		this.var = var;
		P.p("var" + var.toString());
		this.pt = pt;
		P.p("pt" + pt.toString());
		this.es = es;
		P.p("es"+es.toString());
		super.text = String.format("%s . %s %s %s", e.toString(), var, listTypes(pt), listExprs(es));
	}
	
	private String listTypes(List<CuType> es) {
		String s = "< ";
		for (CuType e : es) {
			s += e.toString() + " , ";
		}
		int l = s.lastIndexOf(", ");
		if (l > 0) s = s.substring(0, l);
		s += ">";
		return s;
	}
	
	private String listExprs(List<CuExpr> es) {
		String s = "( ";
		for (CuExpr e : es) {
			s += e.toString() + " , ";
		}
		int l = s.lastIndexOf(", ");
		if (l > 0) s = s.substring(0, l);
		s += ")";
		return s;
	}
}
