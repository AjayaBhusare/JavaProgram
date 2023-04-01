package demo;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("enter the power");
		int p=sc.nextInt();
		sc.close();
		int i=1;
		int power=1;
		while(i<=p)
		{
			power=power*n;
			i++;
		}
         System.out.println(n+" to the power of "+p+" is "+power);
	}

}
