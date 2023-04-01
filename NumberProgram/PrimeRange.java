package demo;

import java.util.Scanner;

public class PrimeRange {

public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System.out.println("enter the starting number");
		int start=r.nextInt();
		System.out.println("enter the ending number");
		int end=r.nextInt();
		r.close();
		System.out.println("the prime numbers between 1 to  "+end+" are");
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				count++;
			}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}

	}
}
