package patternpro;

import java.util.Scanner;

public class Triangle554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of rows");
		int row=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=row;i++)
		{
			int count=row;
			for(int j=1;j<=i;j++)
			{
				System.out.print(count--);
			}
			System.out.println();
		}

	}

}
