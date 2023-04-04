package patternpro;

import java.util.Scanner;

public class LeftTriangle101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		
		sc.close();
		int a=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				if(a%2==0)
				{
					a=1;
				}
				else
				{
					a=0;
				}
			}
			System.out.println();
		}

	}

}
