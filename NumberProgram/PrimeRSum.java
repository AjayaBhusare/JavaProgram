package demo;

import java.util.Scanner;

public class PrimeRSum {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enter the range");
		int range=r.nextInt();
		r.close();
	
		int sum=0;
		for(int i=2;i<=range;i++)
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
			  sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
