package operator;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the side");
		int side=name.nextInt();
		name.close();
		double res=side*side;
		System.out.println("Area of Square is "+res);

	}

}
