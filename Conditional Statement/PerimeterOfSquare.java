package operator;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the side");
		int side=name.nextInt();
		name.close();
		double res=4*side;
		System.out.println("perimeter of Square is "+res);

	}

}
