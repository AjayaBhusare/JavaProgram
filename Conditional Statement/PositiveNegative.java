package decisionMaking;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("num is Positive");
		}
		else
		{
			System.out.println("num is Negative");
		}
      sc.close();

	}

}
