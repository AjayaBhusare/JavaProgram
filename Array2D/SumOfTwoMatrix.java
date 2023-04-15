package array2d;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		int[][] a= {{1,2},{4,5}};
		int[][] b= {{1,2},{4,5}};
		
		int[][]c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
	            c[i][j]=a[i][j]+b[i][j];
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
