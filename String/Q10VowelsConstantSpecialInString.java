package string;

public class Q10VowelsConstantSpecialInString {

	public static void main(String[] args) {

		String st1="aj@y@bh&$dsreom#";
		int vowels=0,cons=0,schar=0;
		for(int i=0;i<st1.length();i++)
		{
			if(st1.charAt(i)>='a' && st1.charAt(i)<='z')
			{
				if(st1.charAt(i)=='a'||st1.charAt(i)=='e'||st1.charAt(i)=='i'
						||st1.charAt(i)=='o'||st1.charAt(i)=='u')
				{
					vowels++;
				}
				else
				{
					cons++;
				}
			}
			else
			{
				schar++;
			}
		}
		System.out.println("number of vowels are "+vowels);
		System.out.println("number of cons are "+cons);
		System.out.println("number of Special char are "+schar);
	}

}
