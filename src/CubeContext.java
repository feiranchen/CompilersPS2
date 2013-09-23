import java.util.Map;
import java.util.HashMap;

public class CubeContext {
	private Map<String,CuType> mVariables = new HashMap<String,CuType>();
	private Map<String,CubeFunction> mFunctions = new HashMap<String,CubeFunction>();

	public CuType getVariable(String name) { return mVariables.get(name); }
	public CubeFunction getFunction(String name) { return mFunctions.get(name); }
}
