package array;

public class Palindrome {

	public static void main(String[] args) {
		
		int[] arr= {111,232,345,777,897};
		
		for(int i=0;i<arr.length;i++)
		{         
	       int reverse=0;
	       for(int j=arr[i];j!=0;j=j/10)
		   {
		   reverse=reverse*10+j%10;
		    }
			if(arr[i]==reverse)
			{
		   System.out.println(arr[i]);
			}
		}

	}

}
