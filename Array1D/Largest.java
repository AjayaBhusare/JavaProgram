package array;

public class Largest {

	public static void main(String[] args) {
	int[] arr= {2,4,56,17,11,18};
	int large=0;
	for(int i=0;i<arr.length;i++)
	{  
		if(arr[i]>large)
	    {
		 large=arr[i];
		}
	}
      System.out.println(large);
	}

}
