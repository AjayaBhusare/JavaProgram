package string;

import java.util.Arrays;

public class Q1AnagramOrNot {

	public static void main(String[] args) {
	
		String s1="RacE";
		String s2="CAre";
		
		if(s1.length()==s2.length())
		{
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println(s1+" and "+s2+" are anagram");
			}
			else
			{
				System.out.println(s1+" and "+s2+" are not anagram");
			}
		}
		else
		{
			System.out.println("length are not equal.not a anagram");
		}
	}

}
