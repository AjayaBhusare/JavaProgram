package string;

public class Q31Rainbow {

	public static void main(String[] args) {

		String s1 = "Red Yellow Blue Green Purple Black White";

		
			for(int i=0;i<s1.length();i++)
			{
				if (i==0) {
					System.out.println(s1.charAt(i));
				}
				if (s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
				{
					System.out.println(s1.charAt(i+1));
				}
			}
		
	}

}
