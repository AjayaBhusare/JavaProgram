package patternpro;

import java.util.Scanner;

public class RightTriangle554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=row;i++)
		{
			int count=row;
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(count--);
			}
			System.out.println();
		}


	}

}
