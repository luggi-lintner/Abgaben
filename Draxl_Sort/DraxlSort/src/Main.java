import java.util.*;
public class Main {
	
	

	public static ArrayList<Integer> getRandomList(int size)
	{
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		Random r = new Random();
		for(int i=0; i<size; i++)
		{
			zahlen.add(r.nextInt(1000));
		}
		
		return zahlen;
		 
	}
	
	public static ArrayList<Integer> Quick(ArrayList<Integer> zahlen)
	{
		if(zahlen.size()<=1)
		{	
			return(zahlen);
			
		}
		
		int pivot=0;
		int zufallszahl=0;
		ArrayList<Integer> lower = new ArrayList<Integer>();
		ArrayList<Integer> higher = new ArrayList<Integer>();
		
		ArrayList<Integer> erg = new ArrayList<Integer>();
		Random zufall = new Random(); 
		zufallszahl=zufall.nextInt(zahlen.size());
		pivot=zahlen.get(zufallszahl);
		System.out.println(pivot);
		
		for(int i=1; i<zahlen.size(); i++)
		{
			if(i==pivot)
				continue;
			if(zahlen.get(i)<pivot)
			{
				lower.add(zahlen.get(i));
			}
			else
			{
				higher.add(zahlen.get(i));
			} 
		}
		
		erg.addAll(Quick(lower));
		erg.add(pivot);
		erg.addAll(Quick(higher));
		
		return erg;
		
		}
		
		
		
		
	
	
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> zahlen = new ArrayList();
		
		
		
		
			
		
		
		
		
		zahlen.add(8);
		zahlen.add(4);
		zahlen.add(7);
		zahlen.add(5);
		zahlen.add(9);
		
		int x=0;
		long zeit;
		
		long startzeit= System.currentTimeMillis();
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
				
			
		}
		
		/*System.out.println(zahlen);
		System.out.println("\n");
		long endzeit = System.currentTimeMillis();
		zeit = endzeit - startzeit;
		
		
		
		System.out.println("gemessene Zeit: "+ zeit + " Millisekunden");*/
		
		System.out.println(Quick(zahlen));
	
		
	}
	

}
