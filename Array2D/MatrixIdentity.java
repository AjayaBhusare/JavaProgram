package array2d;

public class MatrixIdentity {

	public static void main(String[] args) {
		
		int[][] a= {{1,0,0},{0,1,0},{0,0,1}};
        int f=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j && a[i][j]!=1)
				{
					  f=1;
					  break;
				}
				else if(i!=j && a[i][j]!=0)
				{
					 f=1;
					  break;
				}
			}
		}
		if(f==0)
		{
			System.out.println("identity");
		}
		else
		{
			System.out.println("not identity");
		}
	}

}
