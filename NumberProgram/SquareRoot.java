package loop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        sc.close();
        for(int i=1;i<=num/2;i++)
        {
        	if(num==(i*i))
        	{
        		 System.out.println("square root of "+num+" is "+i);
        	}
        }
       
	}

}
