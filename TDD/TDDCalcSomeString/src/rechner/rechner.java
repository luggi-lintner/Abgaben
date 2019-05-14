package rechner;

public class rechner {
	
	public static int add(String input, String delimeter) throws InvalidFormatException
	{
		Integer value=0;
		String[] stringNumbers = input.split(delimeter);
		if(stringNumbers.length<2)
		{
			throw new InvalidFormatException();
		}
		try
		{
			for(int i=0; i<stringNumbers.length; i++)
			{
				value=value+Integer.parseInt(stringNumbers[i]);
				
				
			}
			
			return value;
			
			
		}catch(NumberFormatException e) {
			throw new InvalidFormatException();
		}
		
		
	}
	
	public static int add(String input) throws InvalidFormatException
	{
		return rechner.add(input, ";");
	}

	

}
