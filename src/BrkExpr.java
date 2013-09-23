import java.util.List;

public class BrkExpr extends CuExpr {
	private List<CuExpr> data_es;
	public BrkExpr(List<CuExpr> es){
		super.text=printLst(es);
	}
	
	private <T>String printLst(List<T> pt){
		if (pt.isEmpty()) return "";
		StringBuilder stB=new StringBuilder();
		for( T t : pt){
			stB.append(pt.toString()+ " ");
		}
		return stB.substring(0,stB.length()-2);
	}
}
