package decisionMaking;

import java.util.Scanner;

public class SmallestTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		if(a<b)
		{
			System.out.println(" a is smaller");
		}
		else
		{
			System.out.println(" b is smaller");
		}


	}

}
