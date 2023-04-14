package array;

import java.util.Scanner;

public class AsciiValueOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println(name.length());
		sc.close();
		
		int arr[]=new int[name.length()];
		
		for(int i=0;i<name.length();i++)
		{
			arr[i]=name.charAt(i);
			System.out.print(arr[i]+" ");
			
		}

	}

}
