package array2d;

public class SparseMatrix {

	public static void main(String[] args) {
		int[][] a= {{1,0,2},{0,7,0},{5,0,0}};
		int count=0;
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>(row*col)/2)
		{
			System.out.println("Sparse Matrix");
		}
		else
		{
			System.out.println("not sparse Matrix");
		}
	}

}
