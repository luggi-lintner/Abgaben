import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		
		zahlen.add(8);
		zahlen.add(7);
		zahlen.add(4);
		zahlen.add(10);
		zahlen.add(3);
		zahlen.add(17);
		zahlen.add(11);
		zahlen.add(-4);
		
		int x=0;
		
		
		for(int j=1; j<zahlen.size(); j++)
		{
			for(int i=0; i<zahlen.size(); i++ )
			{
				if(zahlen.get(j)>zahlen.get(i))
				{
					x=zahlen.get(i);
					zahlen.set(i, zahlen.get(j));
					zahlen.set(j,x);
					
				}
				
			}
			
			
			System.out.println(zahlen);
		}
	}

}
