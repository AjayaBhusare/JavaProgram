package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int num = sc.nextInt();
		int reverse = 0;
		for (int i = num; i != 0; i = i / 10) 
		{
			int rem = i % 10;
			reverse = reverse * 10 + rem;
		}
		if (num == reverse)
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}
        sc.close();
	}

}
