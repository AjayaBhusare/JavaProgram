package array2d;

public class TwoIdenticalMatrix {

	public static void main(String[] args) {
		
		int[][] a= {{1,2},{4,5},{7,9}};
		int[][] b= {{1,2},{4,5},{7,9}};
        int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(a[i][j]==b[i][j])
				{
					count++;
				}
			}
		}
		if(count==(a.length+b.length))
		{
			System.out.println("Two Matrix are Identical");
		}
		else
		{
			System.out.println("Two Matrix are not Identical");
		}
	}

}
