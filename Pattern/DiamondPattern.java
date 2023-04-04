package patternpro;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
	    int row=sc.nextInt();
	    sc.close();
	    for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	    for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
