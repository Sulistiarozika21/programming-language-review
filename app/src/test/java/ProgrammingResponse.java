import com.google.gson.annotations.SerializedName;

public class ProgrammingResponse{

	@SerializedName("Java")
	private Java java;

	@SerializedName("C")
	private C C;

	@SerializedName("Javascript")
	private Javascript javascript;

	@SerializedName("Go")
	private Go go;

	@SerializedName("Python")
	private Python python;

	@SerializedName("Dart")
	private Dart dart;

	public Java getJava(){
		return java;
	}

	public C getC(){
		return C;
	}

	public Javascript getJavascript(){
		return javascript;
	}

	public Go getGo(){
		return go;
	}

	public Python getPython(){
		return python;
	}

	public Dart getDart(){
		return dart;
	}
}
