package patternpro;

import java.util.Scanner;

public class SquareStarBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of rows");
		int row=sc.nextInt();
		System.out.println("enter the value of column");
		int col=sc.nextInt();
		sc.close();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1||i==row||j==1||j==col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
