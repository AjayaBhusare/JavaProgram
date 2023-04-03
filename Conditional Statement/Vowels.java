package decisionMaking;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press any key");
		char ch=sc.next().charAt(0);
		sc.close();
		
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Vowels");
		}
		else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowels");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("consonant");
		}

	}

}
