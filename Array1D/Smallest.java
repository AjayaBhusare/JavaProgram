package array;

public class Smallest {

	public static void main(String[] args) {
		int[] arr= {2,4,56,17,11,18};
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]<small)
		    {
			 small=arr[i];
			}
		}
	      System.out.println("smallest element in arrya is "+small);
		}
}
