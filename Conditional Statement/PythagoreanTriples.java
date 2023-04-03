package decisionMaking;

import java.util.Scanner;

public class PythagoreanTriples {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the perpendicular");
		int perpendi=name.nextInt();
		System.out.println("enter the base");
		int base=name.nextInt();
		System.out.println("enter the hypotenus");
		int hypo=name.nextInt();
		name.close();
		int side=((perpendi*perpendi)+(base*base));
		int hypotenuse=hypo*hypo;
		
		if(side==hypotenuse)
		{
			System.out.println("Triangle is Pythagorean Triples");
		}
		else
		{
			System.out.println("Triangle is not Pythagorean Triples");
		}

	}

}
