package patternpro;

import java.util.Scanner;

public class LeftTriangle111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		sc.close();
		
		int count=1;
		for(int i=row;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count);
			}
			count++;
			System.out.println();
		}

	}

}
