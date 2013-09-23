import java.util.ArrayList;
import java.util.List;


public class Stats extends CuStat{
	private ArrayList<CuStat> al;
	public Stats (List<CuStat> cu) {
		al = (ArrayList<CuStat>) cu;		
	}
	public String toString() {
		String name;
		name = "{ ";
		for (CuStat cs : cu) {
			name += cs.toString() + " ";
		}
		name += "}";
		return name;
	}
}
