package LinkedList;

public class Node <e> {

		
		private e value;
		private Node next = null;
		private Node prev = null;
		
		public Node(e value)
		{
			this.value = value;
			
		}
		
		public e getValue()
		{
			return this.value;
		}
		
		public void setValue(e value)
		{
			this.value = value;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node next)
		{
			this.next = next;
		}
		
		public Node getPrev()
		{
			return prev;
		}
		
		public void setPrev(Node prev)
		{
			this.prev = prev;
		}

	}



