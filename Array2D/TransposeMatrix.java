package array2d;

public class TransposeMatrix {

	public static void main(String[] args) {
        int[][] arr= {{1,2,3},{5,6,7}};
	
        int[][] b=new int[3][2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				b[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
