package decisionMaking;

import java.util.Scanner;

public class AgeCompare3 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the age person 1");
			int age1=sc.nextInt();
			System.out.println("enter the age person 1 ");
			int age2=sc.nextInt();
			System.out.println("enter the age person 1");
			int age3=sc.nextInt();
			
			String res=(age1>age2)?((age1>age3)?"a is largest":"c is largest"):((age2>age3)?"b is largest":"c is largest");
			System.out.println(res);
			sc.close();

	}

}
