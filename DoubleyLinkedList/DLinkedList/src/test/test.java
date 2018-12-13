package test;

import static org.junit.Assert.*;

import LinkedList.LinkedList;

import org.junit.Test;

public class test {

	@Test
	public void testBackAddValue() 
	{
		LinkedList ll = new LinkedList();
		ll.backadd(5);
		assertEquals(5,5);
		
	}
	
	@Test
	public void testFrontAddValue()
	{
		LinkedList ll = new LinkedList();
		ll.frontadd(5);
		assertEquals(5,5);
	}
	
	@Test
	public void testDelete()
	{
		LinkedList ll = new LinkedList();
		ll.frontadd(5);
		ll.frontadd(6);
		ll.frontadd(7);
		ll.frontadd(8);
		ll.delete(1);
		assertEquals(7,ll.getFrom(1));
		
	}

}
