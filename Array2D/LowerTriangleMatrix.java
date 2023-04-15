package array2d;

public class LowerTriangleMatrix {

	public static void main(String[] args) {
		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row=a.length;
		int col=a[0].length;
		
		if(row!=col)
		{
			System.out.println("Matrix must be Square matrix");
		}
		else
		{
			System.out.println("Lower Triangular Matrix");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j>i)
					System.out.print("0 ");
				else
				System.out.print(a[i][j]+" ");		
		}
			System.out.println();
		}
	}

}
