import java.util.List;


public class TypeScheme extends CuTypeScheme {
	List<String> data_kc;
	List<CuVvt>    data_tc;
	CuType         data_t;
	public TypeScheme(List<String> kc, List<CuVvt> tc , CuType t){
		data_kc=kc;
		data_tc=tc;
		data_t=t;
		super.text=listString(data_kc)+" "+listTypes(data_tc)+" : "+t.toString();
	}

	private String listString(List<String> es) {
		String s = "< ";
		for (String e : es) {
			s += e.toString() + " , ";
		}
		int l = s.lastIndexOf(", ");
		if (l > 0) s = s.substring(0, l);
		s += ">";
		return s;
	}
	
	private String listTypes(List<CuVvt> es) {
		String s = "( ";
		for (CuVvt e : es) {
			s += e.toString() + " , ";
		}
		int l = s.lastIndexOf(", ");
		if (l > 0) s = s.substring(0, l);
		s += ")";
		return s;
	}
}
