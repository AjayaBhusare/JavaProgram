package demo;

import java.util.Scanner;

public class CompositeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		int count=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count>=2)
		{
			System.out.println("num is composite");
		}
		else
		{
			System.out.println("num is not composite");
		}
		sc.close();


	}

}
