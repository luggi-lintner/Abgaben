import java.util.ArrayList;
public class Main {
	
	private void move(int n, ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> target)
	{
		move(n-1, src, target, aux);
		target.add(src.remove(src.size()-1));
		move(n-1, aux,src,target);
		if(n==1)
		{
			return;
		}
	}
	



	public static void main(String[] args) 
	{
		
				
		

		
	
	}
}
