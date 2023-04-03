package patternpro;

import java.util.Scanner;

public class Triangle555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		sc.close();
	
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		}

	}
