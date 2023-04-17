package array2d;

public class LargestElementInRows {

	public static void main(String[] args) {
		int[][] a= {{1,2,6},{3,8,6},{9,8,7}};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println("Largest element of "+i+" row is "+max);
		}
          
	}

}
