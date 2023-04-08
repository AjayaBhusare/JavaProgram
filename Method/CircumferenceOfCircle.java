package method;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
	   int radius=sc.nextInt();
	   sc.close();
        circum(radius);
	}

	public static void circum(int radius)
	{
		double circum=(2*3.14*radius);
		System.out.println("circumference of cicle is "+circum);
	}

}

