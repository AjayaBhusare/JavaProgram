package loop;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=num;i!=0;i=i/10)
		{
			int rem=i%10;
			int factorial=1;
			for(int j=1;j<=rem;j++)
			{
				factorial=factorial*j;
			}
			sum=sum+factorial;
		}
		if(sum==num)
		{
			System.out.println(num+" is a Strong number");
		}
		else
		{
			System.out.println(num+" not a Strong number");
		}
	}
}
