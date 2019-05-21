package test;

import static org.junit.Assert.*;
import rechner.*;


import org.junit.Test;

public class TestCalcSum {

	

	@Test
	public void validInput() throws InvalidFormatException {
		assertEquals(11,rechner.add("4;7"));
		
	}
	
	@Test(expected=InvalidFormatException.class)
	public void invalidDelimeter() throws InvalidFormatException {
		rechner.add("4 7");
	}

	@Test(expected=InvalidFormatException.class)
	public void invalidNumber() throws InvalidFormatException {
		rechner.add("4;a");
	}
}
