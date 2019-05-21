package Matrix;

public class Matrix {
	
	public static int multiplication(int a, int b)
	{
		int[][] matrixA ={{1,2},{3,4}};
		int[][] matrixB ={{1,1},{1,1}}; 
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
	
	public static int ad(int a, int b)
	{
		int[][] mat1 ={{1,2},{3,4}};
		int[][] mat2 = {{1,1},{1,1}};
		int[][] erg = new int[100][100];
		
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat2[0].length; j++)
			{
				erg[i][j] += mat1[i][j] + mat2[i][j];
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
