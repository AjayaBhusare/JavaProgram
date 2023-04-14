package array;

public class CharPalindrome {

	public static void main(String[] args) {
	
		char[] arr= {'a','b','c','c','b','a'};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>(i+j)/2;j--) {
			if(arr[i]==arr[j])
			{
			  count++;
			}
		  }
		}
		if(count==(arr.length)/2)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
