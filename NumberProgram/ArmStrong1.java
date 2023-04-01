package loop;

import java.util.Scanner;

public class ArmStrong1 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enter a number");
		int num=r.nextInt();
		int t1=num;
		r.close();
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
		int temp2=num;
		int rem=0;
		int arm=0;
		while(temp2!=0)
		{
			 rem=temp2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
				temp2=temp2/10;
			}
			arm=arm+mul;
		}
        if(num==arm)
        {
        	System.out.println("ArmStrong number");
        }
        else
        {
        	System.out.println("not a ArmStrong");
        }
	}



}
