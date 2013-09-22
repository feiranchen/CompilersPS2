import java.util.Map;
import java.util.HashMap;

public class CubeContext {
	private Map<String,CubeType> mVariables = new HashMap<String,CubeType>();
	private Map<String,CubeFunction> mFunctions = new HashMap<String,CubeFunction>();

	public CubeType getVariable(String name) { return mVariables.get(name); }
	public CubeFunction getFunction(String name) { return mFunctions.get(name); }
}
