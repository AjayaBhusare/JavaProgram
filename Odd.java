package demo;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int range=sc.nextInt();
		sc.close();
		System.out.println("The odd number between 1 to "+range+" is");
		for(int i=1;i<=range;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+",");
			}
		}

	}

}
