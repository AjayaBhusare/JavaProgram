package decisionMaking;

import java.util.Scanner;

public class Sum50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int res=a+b;
		if(res>=50)
		{
			System.out.println("sum is greater than 50");
		}
		else
		{
			System.out.println("sum is less than 50");
		}

	}

}
