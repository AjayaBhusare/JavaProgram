package loop;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==num)
			{
				System.out.println("the given num "+num+" is Perfect");
			}
			else
			{
				System.out.println("the given num is not Perfect");
			}
			sc.close();
		}

	}

