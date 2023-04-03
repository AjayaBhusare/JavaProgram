package patternpro;

import java.util.Scanner;

public class Triangle544 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of rows");
	int row=sc.nextInt();
	sc.close();
	int count=row;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(count);
		}
		count--;
		System.out.println();
	}

	}

}
