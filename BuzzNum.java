package demo;

import java.util.Scanner;

public class BuzzNum {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enter a number");
		int num=r.nextInt();
		r.close();
		
		if(num%7==0 || num%10==7)
		{
			System.out.println(num+" is a buzz number");
		}
		else 
		{
			System.out.println(num+" is not a buzz Number");
		}
         
	}

}
