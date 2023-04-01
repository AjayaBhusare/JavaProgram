package exp;

import java.util.Scanner;

public class NTo1Print {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the number");
		int n=name.nextInt();
		name.close();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
