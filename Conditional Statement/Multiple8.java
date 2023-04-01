package operator;

import java.util.Scanner;

public class Multiple8 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		sc.close();
		if(num%8==0)
		{
			System.out.println(num+" is multiple of 8");
		}
		else
		{
			System.out.println("not a multiple of 8");
		}

	}

}
