package demo;

import java.util.Scanner;

public class GCDdyna {

	public static void main(String[] args) {
	  
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num1");
		int num1=sc.nextInt();
		System.out.println("enter a num2");
		int num2=sc.nextInt();
		sc.close();
		int num3=0;
		if(num1>num2)
		{
		 num3=num2;
		}
		else
		{
		  num3=num1;
		}
		
		for(int i=num3/2;i>1;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println("GCD of "+num1+" and "+num2+" is "+i);
				break;
			}
		}

	}

}
