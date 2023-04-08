package method;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the term");
		int term=sc.nextInt();
		 sc.close();
	    fibo(term);
	}
	
	public static void fibo(int term)
	{
		int a=0,b=1;
		for(int i=1;i<=term;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	
	}

}




