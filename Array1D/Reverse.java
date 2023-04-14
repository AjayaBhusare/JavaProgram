package array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner name = new   Scanner(System.in);
		 
			int[] arr=new int[5];
			System.out.println("enter number");
			for(int i=0;i<arr.length;i++)
			{
			    arr[i]=name.nextInt();
			}
			System.out.println("array elements");
			for(int i=0;i<=arr.length-1;i++)
			{
			 System.out.print(arr[i]+" ");
			}
			System.out.println("\narray reverse elements");
			for(int i=arr.length-1;i>=0;i--)
			{
			 System.out.print(arr[i]+" ");
			}
			name.close();

	}

}
