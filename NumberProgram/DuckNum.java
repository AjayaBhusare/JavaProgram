package demo;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enter a number");
		int num=r.nextInt();
		r.close();
		
		int count=0;
		
		for(int i=num;i!=0;i=i/10)
		{
		 if(i%10==0)
		 {
			 count++;
		 }
		}
        if(count>0)
        {
        	System.out.println("Duck Number");
        }
        else
        {
        	System.out.println("not a Duck Number");
        }
	}

}
