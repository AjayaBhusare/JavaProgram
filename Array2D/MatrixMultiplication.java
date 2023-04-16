package array2d;

public class MatrixMultiplication {

	public static void main(String[] args) {
     
		int[][] a= {{7,2,3},{3,6,5},{3,6,5}};
		int[][] b= {{1,8,3},{3,4,5},{3,4,9}};
		int[][] c=new  int[3][3];
		int col=a.length;
		int row=b.length;
		if(row!=col)
		{
			System.out.println("Matrix must be Square matrix");
		}
		else
		{
			System.out.println(" Matrix multiplication");
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					for(int k=0;k<a[i].length;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		}

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
