package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Matrix.*;
import Matrix.InvalidMatrxException;

public class MatrixTest {

	
	@Test
	public void abfrageTest()
	{
		assertEquals(2,Matrix.abfrage(0,1), 0.0001);
		assertEquals(4, Matrix.abfrage(1,1), 0.0001);
	}
	
	
	
	@Test
	public void testMultiplication() throws InvalidMatrxException
	{
		float[][] matrixA ={{(float) 1.5,2},{3,4}};
		float[][] matrixB = {{1,1},{(float) 1.8,1}};
		assertEquals(5.1,Matrix.multiplication(matrixA, matrixB,0,0), 0.0001);	
		
	}
	
	@Test
	public void testAddition() throws InvalidMatrxException
	{
		float[][] matrixA ={{1,2},{3,4}};
		float[][] matrixB = {{1,1},{1,1}};
		assertEquals(5,Matrix.addition(matrixA, matrixB, 1,1), 0.0001); 
	}
	
	@Test(expected=InvalidMatrxException.class)
	public void testInvalidMatrixMultiplikation() throws InvalidMatrxException 
	{
		float[][] matrixA ={{1,2,1},{3,4,1}};
		float[][] matrixB = {{1,1},{1,1}};
		Matrix.multiplication(matrixA, matrixB, 1, 1);
		
	}
	
	@Test(expected=InvalidMatrxException.class)
	public void testInvalidMatrixAddition() throws InvalidMatrxException
	{
		float[][] matrixA ={{1,2,1},{3,4}};
		float[][] matrixB = {{1,1},{1,1}};
		Matrix.addition(matrixA, matrixB, 1, 1);
	}
	
	@Test
	public void testSkalarMultiplication()
	{
		float[][] matrixA ={{1,2},{3,4}};
		float skalar = (float) 3.24;
		
		
		assertEquals(12.96,Matrix.skalarMultiplication(matrixA, skalar, 1,1),0.0001);
		
	}
	
}
