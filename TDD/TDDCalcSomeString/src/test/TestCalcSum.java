package test;

import static org.junit.Assert.*;
import rechner.*;

import org.junit.Test;

public class TestCalcSum {

	@Test
	public void validInput() {
		assertEquals(11,rechner.add("4;7"));
		
	}

}
