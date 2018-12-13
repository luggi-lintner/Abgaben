
public class Main {
	
	
	public static int pd(int zeile, int index)
	{
		if(index==0 || index==zeile)
		{
			return 1;
		}
		
		return pd((zeile-1), (index-1)) +pd((zeile-1), index);
	}
	
	public static int fib(int index)
	{
		if(index == 0 || index == -1)
		{
			return 1;
		}
		
		return fib((index-1)) + fib((index-2));
	}
	
	
	
	/*public static int pditerativ(int zeile, int index)
	{
		for(int z=0; z<=zeile; z++)
		{
			for(int i=0; i<=z; i++)
			{
					
			}
		}
	}*/
	
	public static int fac(int n)
	{
		int x=1;
		for(int i=1; i<=n; i++)
		{
			x=x*i;
		}
		
		return x;
	}
	
	public static int facrec(int n)
	{
		if(n==1)
		{
			return (n);
			
		}
		
		return(facrec(n-1)*n);
	}
	
	public static int facrecE(int n, int x)
	{
		
		if(n==1)
		{
			return (x);
			
		}
		
		return(facrecE((n-1),(x*n)));
	}
	
	
	
	//public static bool isPalindrom(String s)
	{
		
	}

	public static void main(String[] args) {
		
		
		
		//System.out.println(fac(4));
		
		//System.out.println(pd(10,5));
		
		//System.out.println(fib(5));
		
		//System.out.println(facrec(5));
		
		System.out.println(facrecE(5,1));
		
		

	}

}
