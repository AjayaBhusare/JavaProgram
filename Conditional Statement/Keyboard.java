package decisionMaking;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("press any key");
		char ch=sc.next().charAt(0);
		sc.close();
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lower Case");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper case");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special charater");
		}

	}

}
