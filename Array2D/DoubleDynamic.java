package array2d;

import java.util.Scanner;

public class DoubleDynamic {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of row");
        int row=sc.nextInt();
        System.out.println("no of column");
        int col=sc.nextInt();
		
		double[][] arr=new double[row][col];
	
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
			arr[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		sc.close();
	}

}
