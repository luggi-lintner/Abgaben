package test;

import static org.junit.Assert.*;

import org.junit.Test;

import LinkedList.linkedList;

public class test {

	@Test
	public void testAddValue() {
		linkedList ll = new linkedList();
		ll.add(5);
		assertEquals(5,5);
		
		
	}
	

}
