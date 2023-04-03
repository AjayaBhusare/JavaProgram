package operator;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the length");
		int length=name.nextInt();
		System.out.println("enter the Width");
		int width=name.nextInt();
		name.close();
		double res=2*(length+width);
		System.out.println("perimeter of rectangle is "+res);

	}

}
