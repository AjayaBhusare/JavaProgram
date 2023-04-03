package patternpro;

import java.util.Scanner;

public class SquareHollowNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of rows");
		int row=sc.nextInt();
		sc.close();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==1||i==row||j==1||j==row||i==j||i+j==row+1)
				{
					System.out.print(i);
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
