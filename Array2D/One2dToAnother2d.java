package array2d;

public class One2dToAnother2d {

	public static void main(String[] args) {
		int[][] a= {{1,2},{4,5}};
		int[][] b= {{1,2},{4,5}};
		int count=0;
        
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
	           if(a[i][j]==b[i][j])
	           {
	        	   count++;
	           }
			}
		}
	if(count==(a.length+b.length))
	{
		System.out.println("elements of one 2d array are present in another 2d array");
	}
	else
	{
		System.out.println("not same");
	}
  }
}
