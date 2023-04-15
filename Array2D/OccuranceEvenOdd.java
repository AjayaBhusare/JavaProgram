package array2d;

public class OccuranceEvenOdd {

	public static void main(String[] args) {
		
		int[][] a= {{3,6,8,56},{8,3,12,19},{34,67,87}};
		
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					evencount++;
				}
				else
				{
					oddcount++;
				}
			}
		}
        System.out.println("Even element are "+evencount);
        System.out.println("Odd element are "+oddcount);
	}

}
