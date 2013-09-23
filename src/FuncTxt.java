// fc=functxt COMMA v=vvc ts=typescheme {$f = new FuncTxt($fc.f, $v.v, $ts.ts);};
public class FuncTxt extends CuFunC {
	CuFunC f; 
	CuVvc v; 
	CuTypeScheme ts;
	
	public FuncTxt(CuFunC f, CuVvc v, CuTypeScheme ts) {
		this.f = f;
		this.v = v;
		this.ts = ts;
		super.text = String.format("%s , %s %s", f.toString(), v.toString(), ts.toString());
	}
}
