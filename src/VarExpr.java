
import java.util.List;


public class VarExpr extends CuExpr{
	private CuExpr data_e;
	private String data_text;
	private List<CubeType> data_pt;
	private List<CuExpr> data_es;
	public VarExpr(CuExpr e, String text, List<CubeType> pt, List<CuExpr> es){
		this.data_e=e;
		this.data_text=text;
		this.data_pt=pt;
		this.data_es=es;
		
		super.text=e.toString()+" "+text+" < "+printLst(pt)+" > ("+printLst(es)+" )";
	}
	private <T>String printLst(List<T> pt){
		StringBuilder stB=new StringBuilder();
		for( T t : pt){
			stB.append(pt.toString()+ " ");
		}
		return stB.substring(0,stB.length()-2);
	}
}
