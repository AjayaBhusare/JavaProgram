package decisionMaking;

import java.util.Scanner;

public class RectangleSquare {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the length");
		int length=name.nextInt();
		System.out.println("enter the Width");
		int width=name.nextInt();
		System.out.println("enter the side");
		int side=name.nextInt();
		name.close();
		double res=side*side;
		System.out.println("Area of Square is "+res);
		double res2=(length+width);
		System.out.println("Area of rectangle is "+res2);
		
		if(side==width && res==res2)
		{
			System.out.println("Rectangle is square");
		}
		else
		{
			System.out.println("Reactangle is not square");
		}

	}

}
