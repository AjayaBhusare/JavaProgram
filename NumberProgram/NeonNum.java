package loop;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        int square=num*num;
        while(square!=0)
        {
        	int digit=square%10;
        	sum=sum+digit;
        	square=square/10;
        }
        if(num==sum)
        {
        	System.out.println(num+" is a Neon number");
        }
        else
        {
        	System.out.println(num+" is not a Neon number");
        }
	}

}
