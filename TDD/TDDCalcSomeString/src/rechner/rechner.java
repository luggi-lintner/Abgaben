package rechner;

public class rechner {
	
	public static int add(String input) throws InvalidFormatException
	{
		String[] stringNumbers = input.split(";");
		if(stringNumbers.length<2)
		{
			throw new InvalidFormatException();
		}
		return Integer.parseInt(stringNumbers[0]) + Integer.parseInt(stringNumbers[1]);
	}
	

}
