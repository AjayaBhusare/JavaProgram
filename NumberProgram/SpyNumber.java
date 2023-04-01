package loop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		int product=1;
		while(num!=0)
		{
			int digit=num%10;
			
			sum=sum+digit;
			product=product*digit;
			
		    num=num/10; 
		}
          if(sum==product)
          {
        	  System.out.println("num is spy number");
          }
          else
          {
        	  System.out.println("num is not spy number");
          }
	}

}
