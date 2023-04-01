package operator;

import java.util.Scanner;

public class LeapYear {
//2004,2008,2012,2016 is leap year.
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		sc.close();
		if((year%4==0) && (year%100!=0))
		{
			System.out.println(year+" is a Leap Year");
		}
		else
		{
			System.out.println("not a Leap Year");
		}

	}

}
