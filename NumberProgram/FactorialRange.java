package exp;

import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	System.out.println("enter starting num");
	int start=name.nextInt();
	System.out.println("enter ending num");
	int end=name.nextInt();
	name.close();
	
	for(int i=start;i<=end;i++)
	{
	    int factorial=1;
	for(int j=1;j<=i;j++)
	{
		factorial=factorial*j;
	}
	
	System.out.println(factorial);
	}
	}

}
