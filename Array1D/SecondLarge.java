package array;

public class SecondLarge {
	public static void main(String[] args) {
		int[] arr= {2,4,56,17,11,18};
		int large=0;//for large=integer.MIN_VALUE; Smallest=integer.MAX_VALUE
		int secondl=0;
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]>large)
		    {
			  secondl=large;
			  large=arr[i];
			}
			else if(arr[i]>secondl && arr[i]!=large)
			{
				secondl=arr[i];
			}
		}
	      System.out.println(large);
	      System.out.println(secondl);
		}
}
