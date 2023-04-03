package decisionMaking;

import java.util.Scanner;

public class Bouns {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the year");
		int year=name.nextInt();
		name.close();

		if(year>=5)
		{
			System.out.println("Eligible for get 5% bouns");
		}
		else
		{
			System.out.println(" not Eligible for get 5% bouns");
		}
	}

}
