package array;

import java.util.Scanner;

public class Copy1AElementTo2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("enter number");
		for(int i=0;i<=size-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int[] newarr=new int[size];
		for(int i=0;i<=size-1;i++)
		{
			 newarr[i]= arr[i];
		}
		System.out.println("new arr is");
		for(int i=0;i<=size-1;i++) {
		System.out.print(newarr[i]+" ");
		}
		sc.close();
	}

}
