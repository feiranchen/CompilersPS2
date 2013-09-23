import java.util.ArrayList;
import java.util.List;


public class Intf extends CuInterface{
	private String intf_name;
	private String funs = "";
	private List<String> kc_name;
	private CuType t;
	private ArrayList<String> v_names = new ArrayList<String>();
	private ArrayList<CuTypeScheme> ts_names = new ArrayList<CuTypeScheme>();
	public Intf (String iname, List<String> kname){
		intf_name = iname;
		kc_name = kname;
		text = "interface " + intf_name.toString() + " <";
		for (String s : kc_name) {
			text += " " + s.toString();
		}
		text += " > extends";
	}
	@Override
	public void add (CuType tt) {
		t = tt;
		text += " " + t.toString();
P.p("add");	
P.p(text);
	}
	@Override
	public void add (String v_name, CuTypeScheme ts) {
		v_names.add(v_name);
		ts_names.add(ts);
		funs += " fun " + v_name + ts.toString() + " ;";
P.p("funs " + funs);
	}
	
	@Override public String toString() {
		text += " { " + funs + " } ";
P.p(text);
		return text;
	}
}
