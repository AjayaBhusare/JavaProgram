package decisionMaking;

import java.util.Scanner;

public class DecimalWhole {

	public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	System.out.println("enter the number");
	double num=name.nextDouble();
	name.close();
	if((num%10)>=0.5)
	{
		System.out.println((int)num +1);
	}
	else
	{
		System.out.println((int)num);
	}

	}

}
