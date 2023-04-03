package decisionMaking;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a english marks");
		double english=sc.nextDouble();
		System.out.println("enter a hindi marks");
		double hindi=sc.nextDouble();
		System.out.println("enter a history marks");
		double history=sc.nextDouble();
		System.out.println("enter a biology marks");
		double biology=sc.nextDouble();
		sc.close();
		
		double res=((english+hindi+history+biology)/4);
		
		System.out.println("Percentage :"+res);

	}

}
