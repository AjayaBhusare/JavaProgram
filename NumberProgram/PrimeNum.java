package loop;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		int count=0;//1--->2
		for(int i=2;i<=a;i++)//i=2
		{
			if(a%i==0)//3%2==0
			{
				count++;
			}
		}
		if(count==1)
		
			System.out.println("num is prime");
		
		else
		
			System.out.println("num is not prime");
		
		sc.close();

	}

}
