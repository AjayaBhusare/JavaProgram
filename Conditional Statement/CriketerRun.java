package decisionMaking;

import java.util.Scanner;

public class CriketerRun {

	public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	System.out.println("enter the run");
	int run=name.nextInt();
	name.close();
	
	if(run==0)
	{
		System.out.println("no Run");
	}
	else if(run==2 || run<=4)
	{
		System.out.println("3 run");
	}
	else if(run<=4)
	{
		System.out.println("boundary with 4 Run");
	}
	else if(run<=6)
	{
		System.out.println("boundary with 6 run");
	}
	}

}
