package string;

public class Q4LowerCaseAndSpeacialChar {

	public static void main(String[] args) {
	
		String st1="aj@y@bhu$@r#AS";
		int lowercount=0;
		int special=0;
		for(int i=0;i<st1.length();i++)
		{
			if(st1.charAt(i)>='a' && st1.charAt(i)<='z')
			{
				lowercount++;
			}
			else if(st1.charAt(i)=='@'||st1.charAt(i)=='#'||st1.charAt(i)=='$')
			{
				special++;
			}
		}
		System.out.println("number of lower case char "+lowercount);
        System.out.println("number of special char "+special);
	}

}
