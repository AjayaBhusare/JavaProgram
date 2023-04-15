package array2d;

public class AdditionOfEachRowElement {

	public static void main(String[] args) {
		
		int[][] a= {{2,3,4},{3,4,5}};
		
		int[] b=new int[2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i]+=a[i][j];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		}

}
