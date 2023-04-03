package decisionMaking;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the Attendance");
		int attend=name.nextInt();
		name.close();
		
		if(attend>=70 && attend<=100)
		{
			System.out.println("Allow to sit in exam");
		}
		else if(attend>=45 && attend<=69)
		{
			System.out.println("solve 5 question paper then allow to sit in exam");
		}
		else
		{
			System.out.println("Don't allow to sit in exam");
		}

	}

}
