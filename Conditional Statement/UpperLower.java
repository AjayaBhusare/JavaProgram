package decisionMaking;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the charater");
		char ch=name.next().charAt(0);
		name.close();

		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper Case");
		}
		else
		{
			System.out.println("Lower Case");
		}

	}

}
