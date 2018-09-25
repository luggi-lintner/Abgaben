
public class Datentypen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 8;
		modifyPrimitive(a);
		System.out.println(a);
		
		String s="h";
		modifyString(s);
		System.out.println(s);
		
		DtContainer d = new DtContainer();
		modifyObject(d);
		System.out.println(d.toString());
		

	}
	
	public static void modifyPrimitive(Integer a)
	{
		a=5;
		
	}
	
	public static void modifyString(String s)
	{
		s="hallo";
	}
	
	public static void modifyObject(DtContainer c)
	{
		c.a=4;
		c.s="Hallo";
	}
	

}
