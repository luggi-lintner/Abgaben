package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Matrix.*;

public class MatrixTest {

	@Test
	public void abfrageTest()
	{
		
		assertEquals(2,Matrix.abfrage(0,1));
		assertEquals(4, Matrix.abfrage(1,1));
	}
	
	@Test
	public void mulTest()
	{
		assertEquals(3,Matrix.multiplication(0,0));	
		
	}
	
	@Test
	public void addTest()
	{
		assertEquals(5,Matrix.ad(1,1)); 
	}
}
