package decisionMaking;

import java.util.Scanner;

public class Greatest2Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		String res=(a>b?"a is Greater":"b is Greater");
		System.out.println(res);

	}

}
