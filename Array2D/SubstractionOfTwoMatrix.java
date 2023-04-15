package array2d;

public class SubstractionOfTwoMatrix {

	public static void main(String[] args) {
		int[][] a= {{7,8,9},{4,5,6},{4,7,9}};
		int[][] b= {{1,1,1},{3,2,1},{8,6,5}};
		
		int[][] c=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
	            c[i][j]=a[i][j]-b[i][j];
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
