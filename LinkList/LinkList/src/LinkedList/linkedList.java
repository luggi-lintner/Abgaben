package LinkedList;

public class linkedList <e> {
	
	private Node head = null;
	private int counter; 
	private int index;
	
	public linkedList()
	{
	}
	
	public void add (e value )
	{
		Node node = new Node(value);
		//list empty
		if (head == null)
		{
			head = node;
			return;
		}
		
		//list has one element
	//	if (head.getNext() == null)
	//	{
	//		head.setNext(node);
	//	}
		
		Node tmp = head;
		while(tmp.getNext() != null)
		{
			tmp = tmp.getNext();
		}
		tmp.setNext(node);
	}

	public Object getFrom(int index)
	{
		counter = 2;
		this.index = index; 
		return hop(head).getValue();
	}
	
	public Node hop(Node pointer)
	{
		if(counter == index)
		{
			return pointer;
		}
		
		//System.out.println(counter);
		counter++;
		return hop(pointer.getNext());
	
	}
	
	public void delete(int index)
	{
		counter = 0;
		this.index = index; 
		Node tempNode = null;
		tempNode = hop(head);
		
		counter = 0;
		this.index = index - 1;
		hop(head).setNext(tempNode.getNext());
		
	}
}
