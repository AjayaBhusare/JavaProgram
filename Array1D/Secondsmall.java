package array;

public class Secondsmall {

	public static void main(String[] args) {
		int[] arr= {2,4,56,17,11,18};
		int small=arr[0];//for large=integer.MIN_VALUE; Smallest=integer.MAX_VALUE
		int secondsmall=arr[1];
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]<small)
		    {
				secondsmall=small;
			    small=arr[i];
			}
			else if(arr[i]<secondsmall && arr[i]!=small)
			{
				secondsmall=arr[i];
			}
		}
	      System.out.println(small);
	      System.out.println(secondsmall);
		}

}
