package method;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
	   int num=sc.nextInt();
	   sc.close();
       factorial(num);

	}
	public static void factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
		 fact=fact*i;
		}
		System.out.println("factorial of num is "+fact);
	}

}
