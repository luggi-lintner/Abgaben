package BST;

public class BinaryTree 
{
	
	Node head;
	
	private Node add(Node aktuell, int value)
	{
		if(aktuell==null)
		{
			return new Node(value);
		}
		
		if(value < aktuell.value)
		{
			aktuell.left= add(aktuell.left, value);
		}
		
		else if(value > aktuell.value)
		{
			aktuell.right = add(aktuell.right, value);
		}
		
		else
		{
			return aktuell;
		}
		
		return aktuell;
	}
	
	
	public void addFromHead(int value)
	{
		head = add(head,value);
	}
	
	public boolean enthaelt(Node aktuell, int value) 
	{
	    if (aktuell == null) {
	        return false;
	    } 
	    if (value == aktuell.value) {
	        return true;
	    } 
	        	      
	    if (value < aktuell.value)
	    {
	    	return enthaelt(aktuell.left, value);
	    }
	    else
	    {
	    	return enthaelt(aktuell.right, value);
	    }
	  	      
	    
	}
	
	public boolean enthealtFromHead(int value)
	{
		return enthaelt(head, value);
	}

	private int findSmallest(Node node)
	{
		int min = node.getValue();
		while(node.left != null)
		{
			min = node.left.getValue();
			node=node.left;
		}
		
		return min;
	}
	
	Node delete(Node aktuell, int value)
	{		
		if(aktuell==null) return null;
		
		if(value < aktuell.getValue())
		{
			aktuell.left = delete(aktuell.left, value);
		}
		else if(value > aktuell.getValue())
		{
			aktuell.right = delete(aktuell.right, value);
		
		}
		else
		{
			if(aktuell.left == null)
			{
				return aktuell.right;
			}
			else if(aktuell.right == null)
			{
				return aktuell.left;
			}
			
			aktuell.setValue(findSmallest(aktuell));
			aktuell.right = delete(aktuell.right, aktuell.getValue());
		}
		
		return aktuell;
		
	}

	
		
	public void deleteFromHead(int value)
	{
		delete(head, value);
		
	}
	
	public int getDepth()
	{
		if (this.head == null)
		{
			return 0;
		}
		
		return getDepth(this.head, 1);
	}
	
	private int getDepth(Node n, int actDepth)
	{
		if(n.right == null && n.left == null)
		{
			return actDepth;
		}
		
		int leftDepth = 0;
		int rightDepth = 0;
		
		if(n.left != null)
		{
			leftDepth = getDepth(n.left, actDepth + 1);
		}
		
		if(n.right != null)
		{
			rightDepth = getDepth(n.right, actDepth + 1);
		}
		
		return Math.max(leftDepth, rightDepth);
	}
	
	/*public void print(Node aktuell)
	{
		int[][] ausgabe = new int[100][100];
		
		
		
		
		
	}*/
	
	
}
