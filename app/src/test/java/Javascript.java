import com.google.gson.annotations.SerializedName;

public class Javascript{

	@SerializedName("read_more")
	private String readMore;

	@SerializedName("hello_world")
	private String helloWorld;

	@SerializedName("description")
	private String description;

	@SerializedName("logo")
	private String logo;

	public String getReadMore(){
		return readMore;
	}

	public String getHelloWorld(){
		return helloWorld;
	}

	public String getDescription(){
		return description;
	}

	public String getLogo(){
		return logo;
	}
}
