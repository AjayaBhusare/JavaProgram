package array2d;

import java.util.Scanner;

public class Char2DArrya {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number of rows");
	int row=sc.nextInt();
	System.out.println("enter number of cols");
	int col=sc.nextInt();
	
		char[][] a=new char[row][col];
		
         for(int i=0;i<a.length;i++)
         {
        	 for(int j=0;j<a[i].length;j++)
        	 {
        		 a[i][j]=sc.next().charAt(0);
        	 }
         }
         for(int i=0;i<a.length;i++)
 		{
 			for(int j=0;j<a[i].length;j++)
 			{
 				System.out.print(a[i][j]+" ");
 			}
 			System.out.println();
 		}
         sc.close();
	}

}
