package exam;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting range");
		int start=sc.nextInt();
		System.out.println("enter the end range");
		int end=sc.nextInt();
		sc.close();
		int product=1;
		for(int i=start;i<=end;i++)
		{
			if(i>0)
			{
			  product=product*i;	
			}
		   else
		   {
		   System.out.println("negative number");
		   }
		}
		System.out.println(product);
	}

}
