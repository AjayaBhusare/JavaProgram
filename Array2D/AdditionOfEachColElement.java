package array2d;

public class AdditionOfEachColElement {

	public static void main(String[] args) {
	
		int[][] a={{1,2,3},{4,5,6}};
		
		int[] b=new int[3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			   b[j]+=a[i][j];
			}
		}
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }
	}

}
