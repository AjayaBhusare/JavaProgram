package decisionMaking;

import java.util.Scanner;

public class RectangleSquare {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the each side length of square");
		int s1=name.nextInt();
		int s2=name.nextInt();
		int s3=name.nextInt();
		int s4=name.nextInt();
		name.close();
		
		if((s1==s2)&&(s2==s3)&&(s3==s4))
		{
			System.out.println("Rectangle is Square");
		}
		else
		{
			System.out.println("Rectangle is not Square");
		}
	}

}
