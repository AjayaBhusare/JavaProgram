package demo;

import java.util.Scanner;

public class FactorSum {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System.out.println("enter the num");
		int num=r.nextInt();
		r.close();
		
		int sum=0;
		for(int i=num/2;i>=1;i--)
		{
		 if(num%i==0)
		 {
		   sum=sum+i;
		 }
		}
		System.out.println(sum);   
	}

}
