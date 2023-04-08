package method;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a num");
	int num=sc.nextInt();
	 sc.close();
	if(prime(num)==1)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("not prime");
	}
	}
	public static int prime(int num)
	{
		int count=0;
	   for(int i=2;i<=num;i++)
	   {
		   if(num%i==0)
		   {
			  count++;
		   }
	   }
	   return count;
	}

}
