package decisionMaking;

import java.util.Scanner;

public class TriangleWhich {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the perpendicular");
		int perpendi=name.nextInt();
		System.out.println("enter the base");
		int base=name.nextInt();
		System.out.println("enter the hypotenus");
		int hypo=name.nextInt();
		name.close();
		
		if(perpendi==base && base==hypo)
		{
			System.out.println("Triangle is Equilateral");
		}
		else if(perpendi==hypo && hypo!=base)
		{
			System.out.println("Triangle is isosceles");
		}
		else
		{
			System.out.println("Triangle is scalene");
		}

	}

}
