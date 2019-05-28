package Matrix;


public class Matrix {
	 
	public static float multiplication(float[][] matrixA, float[][] matrixB, int a, int b) throws InvalidMatrxException
	{
		if(matrixA[0].length != matrixB.length)
		{
			throw new InvalidMatrxException();
			
		}
		float[][] erg = new float[100][100];
		for(int i = 0; i < matrixA.length; i++)
		{
			for(int j = 0; j < matrixB[0].length; j++)
			{
				for(int k = 0; k < matrixA[0].length; k++)
				{
					erg[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return erg[a][b]; 
	}
	
	public static float addition(float[][] matrixA, float[][] matrixB, int a, int b) throws InvalidMatrxException
	{
		if(matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length)
		{
			throw new InvalidMatrxException();
		}
		
		float[][] erg = new float[100][100];
		
		for(int i=0; i<matrixA.length; i++)
		{
			for(int j=0; j<matrixB[0].length; j++)
			{
				erg[i][j] += matrixA[i][j] + matrixB[i][j];
			}
		}
		
		return erg[a][b];
	}
	
	public static float skalarMultiplication(float[][] matrixA, float skalar, int a, int b)
	{
		float[][] erg = new float[100][100];
		for(int i=0; i<matrixA.length; i++)
		{
			for(int j=0; j<matrixA[0].length; j++)
			{
				erg[i][j] += matrixA[i][j] * skalar;
			}
		}
		
		return erg[a][b];
	}
	
	public static float sigmoid(float[][] matrixA, int a, int b)
	{
		float [][] erg = new float [10000][10000];
		for(int i=0; i<matrixA.length; i++)
		{
			for(int j=0; j<matrixA[0].length; j++)
			{
				erg[i][j] += 1/(Math.exp(-matrixA[i][j])+1) ;
			}
		}
		return erg[a][b];
	}
	
	
	
	public static float abfrage(int a, int b){
		
		float abfrageMatrix[][]={{1,2},{3,4}};
		float erg = abfrageMatrix[a][b];
		
		return erg;
		
	
	}
		

	


}
