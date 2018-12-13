package LinkedList;
public class LinkedList <e> {
	private Node head = null;
	private int counter; 
	private int index;
	
	public LinkedList()
	{
	}
	
	public void frontadd (e value )
	{
		Node node = new Node(value);
		
		
		if (head == null)
		{
			head = node;
			return;
		}
		
		Node tmp = head;
		while(tmp.getNext() != null)
		{
			tmp = tmp.getNext();
		}
		tmp.setNext(node);
	}
	
	public void backadd(e value)
	{
		Node node = new Node(value);
		
		if (head == null)
		{
			head = node;
			return;
		}
				
		Node tmp = head;
		while(tmp.getPrev() != null)
		{
			tmp = tmp.getPrev();
		}
		tmp.setPrev(node);
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
		
		counter++;
		return hop(pointer.getPrev());
	
	}
	
	public void delete(int index)
	{
		counter = 0;
		this.index = index; 
		Node tempNode = null;
		tempNode = hop(head);
		
		counter = 2;
		this.index = index - 1;
		hop(head).setNext(tempNode.getNext());
		
	}



}
