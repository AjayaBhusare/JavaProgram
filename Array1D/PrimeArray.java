package array;

public class PrimeArray {

	public static void main(String[] args) {
	int[] arr={11,23,44,52,7,2,5};
	
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		for(int j=2;j<=arr[i];j++)
	    { 
			if(arr[i]%j==0)
			{
			  count++;
			}
	     }
		if(count==1)
		{
		 System.out.println(arr[i]);
		}
	}
  }

}
