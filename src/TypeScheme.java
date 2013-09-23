import java.util.List;


public class TypeScheme extends CuTypeScheme {
	List<String> data_kc;
	List<Vvt>    data_tc;
	CuType         data_t;
	public TypeScheme(List<String> kc, List<Vvt> tc , CuType t){
		data_kc=kc;
		data_tc=tc;
		data_t=t;
		super.text=kc.toString()+" "+tc.toString()+" "+t.toString();
	}

}
