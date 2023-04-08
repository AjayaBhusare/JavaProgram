package method;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("make your choice");
	
	System.out.println("1.Area of square");
	System.out.println("2.Area of rectangle");
	System.out.println("3.Area of circle");
	System.out.println("4.area of Triangle");		
	int choice=sc.nextInt();
	 sc.close();
	switch(choice)
	{
	case 1:{
		
		System.out.println("enter side");
		int side=sc.nextInt();
		square(side);
		break;
	}
	case 2:{
		System.out.println("enter length");
		int length=sc.nextInt();
		System.out.println("enter width");
		int width=sc.nextInt();
		rectangle(length,width);
		break;
	}
	case 3:{
		System.out.println("enter radius");
		int r=sc.nextInt();
		circle(r);
		break;
	}
	case 4:{
		System.out.println("enter height");
		int height=sc.nextInt();
		System.out.println("enter base");
		int base=sc.nextInt();
		triangle(height,base);
		break;
	}
	}
}
	public static void square(int side)
	{
		int area=side*side;
		System.out.println(area);
    }
	public static void rectangle(int length,int width)
	{
		int area=length*width;
		System.out.println(area);
    }
	public static void circle(int r)
	{
		double area=(3.14*r*r);
		System.out.println(area);
    }
	public static void triangle(int height,int base)
	{
		int area=((1/2)*height*base);
		System.out.println(area);
	}
}


