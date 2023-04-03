package patternpro;

import java.util.Scanner;

public class RightTriangleAAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=row;i++)
		{
			char ch='A';
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}

	}

}
