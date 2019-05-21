package Matrix;

public class Matrix {
	
	public static int multiplication(int[][] matrixA, int[][] matrixB, int a, int b) throws InvalidMatrxException
	{
		if(matrixA[0].length != matrixB.length)
		{
			throw new InvalidMatrxException();
		}
		int[][] erg = new int[100][100];
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
	
	public static int addition(int[][] matrixA, int[][] matrixB, int a, int b)
	{
		
		int[][] erg = new int[100][100];
		
		for(int i=0; i<matrixA.length; i++)
		{
			for(int j=0; j<matrixB[0].length; j++)
			{
				erg[i][j] += matrixA[i][j] + matrixB[i][j];
			}
		}
		
		return erg[a][b];
	}
	
	
	
	public static int abfrage(int a, int b){
		
		int abfrageMatrix[][]={{1,2},
				{3,4}};
		int erg = abfrageMatrix[a][b];
		
		return erg;
		
	
	}
		

	


}
