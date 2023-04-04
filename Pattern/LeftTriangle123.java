package patternpro;

import java.util.Scanner;

public class LeftTriangle123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		sc.close();
		int r=row;
		for(int i=1;i<=row;i++)
		{
			int n=i;
			for(int j=1;j<=r;j++)
			{
				System.out.print(n++);
			}
			r--;
			System.out.println();
		}
		

	}

}
