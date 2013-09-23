import java.util.List;


public class VvExp extends CuExpr{
	public VvExp(String str){
		super.text=str;
	}
	
	@Override public void add(List<CuType> pt, List<CuExpr> es){
		super.text += " < "+printLst(pt)+" > ("+printLst(es)+" )";
	}
	
	private <T>String printLst(List<T> es) {
		String s = "";
		for (T e : es) {
			s += e.toString() + " ";
		}
		return s;
	}
	
}
