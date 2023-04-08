package method;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
	   int radius=sc.nextInt();
	   sc.close();
     System.out.println(area(radius));
	}

	public static double area(int radius)
	{
		double area=(3.14*radius*radius);
		return area;
	}
}
