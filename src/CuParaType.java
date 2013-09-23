import java.util.ArrayList;
import java.util.List;


public abstract class CuParaType {
	protected List<CuType> paraType;
	//one leading and one trailing space
	protected String listContent;
	final String opening = "< ";
	final String closing = " >";
	public CuParaType(){
		paraType=new ArrayList<CuType>();
		listContent= "";
	}
	
	public abstract void add(CuType t);
	
	public String toString(){
		return opening+listContent+closing;
	}
	
}
