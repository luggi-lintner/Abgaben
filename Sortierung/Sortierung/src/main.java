import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
	
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		
		zahlen.add(8);
		zahlen.add(7);
		zahlen.add(4);
		zahlen.add(10);
		zahlen.add(3);
		zahlen.add(17);
		zahlen.add(11);
		zahlen.add(-4);
		
		int x;
		
		for(int j=0; j<zahlen.size()-1; j++)
		{
			
		
			for(int i=0; i<zahlen.size()-1; i++)
			{
				if(zahlen.get(i) > zahlen.get(i+1))
				{
					x=zahlen.get(i);
					zahlen.set(i,zahlen.get(i+1));
					zahlen.set((i+1),x);
									
					
				}
			}
		}
		
		System.out.println(zahlen);
		
		
		
	}

}
