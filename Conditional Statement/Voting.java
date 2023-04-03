package decisionMaking;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();

		if(age>18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			System.out.println("Not Eligible for Voting");
		}
		sc.close();
	}

}
