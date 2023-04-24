package string;

public class Q40StringPalindrome {

	public static void main(String[] args) {
	
		String st="anna";
		String st1="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
		if(st.equals(st1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String not Palindrome");
		}
	}

}
