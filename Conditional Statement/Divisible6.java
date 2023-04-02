package decisionMaking;

import java.util.Scanner;

public class Divisible6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sc.close();
		
		if(num%6==0)
		{
			System.out.println(num+" is divisible by 6");
		}
		else
		{
			System.out.println(num+" is not divisible by 6");
		}

	}

}
