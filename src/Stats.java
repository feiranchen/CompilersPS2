import java.util.ArrayList;
import java.util.List;


public class Stats extends CuStat{
	private ArrayList<CuStat> al;
	public Stats (List<CuStat> cu) {
		al = (ArrayList<CuStat>) cu;
		text = "{ ";
		for (CuStat cs : al) {
			text += cs.toString() + " ";
		}
		text += "}";
	}
}
