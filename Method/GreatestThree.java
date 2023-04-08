package method;

import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the value num");
		 int a=sc.nextInt();
		 System.out.println("enter the value num1");
		 int b=sc.nextInt();
		 System.out.println("enter the value num2");
		 int c=sc.nextInt();
		 sc.close();
		 greater(a,b,c);

	}
	public static void greater(int a,int b,int c)
	{
		String res=(a>b)?((a>c)?"a is largest":"c is largest"):((b>c)?"b is largest":"c is largest");
		System.out.println(res);
	}

}
