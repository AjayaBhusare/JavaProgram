package array2d;

public class LargestElementInColumn {

	public static void main(String[] args) {
		int[][] a= {{1,2,1},{3,4,7},{7,8,9}};
		
		int []b=new int [3];
		int large=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j][i]>large)
				{
					large=a[j][i];
				}
			}
			System.out.println(large);
		}	
	}

}
