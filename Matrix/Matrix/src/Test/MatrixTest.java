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
		float[][] matrixA ={{(float) 1.5,2},{3,4},{3,3}};
		float[][] matrixB = {{1,1},{(float) 1.8,1}};
		assertEquals(5.1,Matrix.multiplication(matrixA, matrixB,0,0), 0.0001);	
		assertEquals(3.5,Matrix.multiplication(matrixA, matrixB,0,1), 0.0001);	
		assertEquals(10.2,Matrix.multiplication(matrixA, matrixB,1,0), 0.0001);	
		assertEquals(7,Matrix.multiplication(matrixA, matrixB,1,1), 0.0001);
		assertEquals(8.4,Matrix.multiplication(matrixA, matrixB,2,0), 0.0001);	
		assertEquals(6,Matrix.multiplication(matrixA, matrixB,2,1), 0.0001);	
		
		
	}
	
	@Test
	public void testAddition() throws InvalidMatrxException
	{
		float[][] matrixA ={{1,2},{3,4}};
		float[][] matrixB = {{1,1},{1,1}};
		assertEquals(3,Matrix.addition(matrixA, matrixB, 0, 1),0.001);
	
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
	public void testBigMatrixMultiplication() throws InvalidMatrxException
	{ 
		float[][] matrixA ={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		float[][] matrixB={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		assertEquals(40,Matrix.multiplication(matrixA, matrixB, 2, 3),0.0001);
		assertEquals(30,Matrix.multiplication(matrixA, matrixB, 3, 2),0.0001);
		assertEquals(10,Matrix.multiplication(matrixA, matrixB, 0, 0),0.0001);
	}
	
	@Test
	public void testSkalarMultiplication()
	{
		float[][] matrixA ={{1,2},{3,4}};
		float skalar = (float) 3.24;
		assertEquals(12.96,Matrix.skalarMultiplication(matrixA, skalar, 1,1),0.0001);
		 
	}
	
	@Test
	public void testSigmoid()
	{
		float[][] matrixA ={{80},{-100}};
		float[][] matrixB ={{0},{6}};
		assertEquals(1,Matrix.sigmoid(matrixA, 0, 0),0.0001);
		assertEquals(0,Matrix.sigmoid(matrixA, 1, 0),0.0001);
		assertEquals(0.5,Matrix.sigmoid(matrixB, 0, 0),0.0001);
		assertEquals(0.9975,Matrix.sigmoid(matrixB, 1, 0),0.0001); 
		
	}
	
}
