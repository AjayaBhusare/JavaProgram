package decisionMaking;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the number");
		int b=sc.nextInt();
		System.out.println("enter the number");
		int c=sc.nextInt();
		
		String res=(a>b)?((a>c)?"a is largest":"c is largest"):((b>c)?"b is largest":"c is largest");
		System.out.println(res);
		sc.close();

	}
	
}
