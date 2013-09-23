import java.util.ArrayList;
import java.util.List;


public class Intf extends CuInterface{
	private String intf_name;
	private String name;
	private String funs = "";
	private List<String> kc_name;
	private CuType t;
	private ArrayList<String> v_names;
	private ArrayList<CuTypeScheme> ts_names;
	public Intf (String iname, List<String> kname){
		intf_name = iname;
		kc_name = kname;
		name = "interface " + intf_name.toString() + " <";
		for (String s : kc_name) {
			name += " " + s.toString();
		}
		name += " >";
	}
	void add (CuType tt) {
		t = tt;
		name += " extends " + tt.toString() + " { " + funs + " } ";
	}
	void add (String v_name, CuTypeScheme ts) {
		v_names.add(v_name);
		ts_names.add(ts);
		funs += " fun " + v_name + ts.toString() + " ;";
	}
	public String toString() {
		return name;
	}
}
