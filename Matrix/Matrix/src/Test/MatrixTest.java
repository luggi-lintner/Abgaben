package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Matrix.*;
import Matrix.InvalidMatrxException;

public class MatrixTest {

	@Test
	public void abfrageTest()
	{
		
		assertEquals(2,Matrix.abfrage(0,1));
		assertEquals(4, Matrix.abfrage(1,1));
	}
	
	
	
	@Test
	public void mulTest() throws InvalidMatrxException
	{
		int[][] matrixA ={{1,2},{3,4}};
		int[][] matrixB = {{1,1},{1,1}};
		assertEquals(7,Matrix.multiplication(matrixA, matrixB,1,1));	
		
	}
	
	@Test
	public void addTest()
	{
		int[][] matrixA ={{1,2},{3,4}};
		int[][] matrixB = {{1,1},{1,1}};
		assertEquals(5,Matrix.addition(matrixA, matrixB, 1,1)); 
	}
	
	@Test(expected=InvalidMatrxException.class)
	public void invalidMatrix() throws InvalidMatrxException 
	{
		int[][] matrixA ={{1,2,1},{3,4,1}};
		int[][] matrixB = {{1,1},{1,1}};
		Matrix.multiplication(matrixA, matrixB, 1, 1);
		
	}
			
	
}
