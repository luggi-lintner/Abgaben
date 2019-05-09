package rechner;

public class rechner {
	
	public static int add(String string)
	{
		String[] split = string.split(";");
		return(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));
	}

}
