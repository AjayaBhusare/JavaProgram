package string;

public class Q57Rotational {

	public static void main(String[] args) {
		String s1="ABCDE";
		String s2="DEABC";
		String s3=s1+s2;
		if(s1.length()!=s2.length())
		{
			System.out.println("different in length");
		}
		else
		{
		if((s3).contains(s2))
			{
			   System.out.println("are rotational");	
			}
			else
			{
			 System.out.println("not rotational");
			}
		}
	   }
	}


