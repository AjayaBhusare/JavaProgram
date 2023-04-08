package method;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("make your choice ");
		System.out.println("1.Addition");
		System.out.println("2.multi");
		System.out.println("3.division");
		System.out.println("4.substr");
		System.out.println("5.mod");
				
		int choice=sc.nextInt();
		 sc.close();
		switch(choice)
		{
		case 1:{
			System.out.println("enter a");
	        int a=sc.nextInt();
	        System.out.println("enter b");
	        int b=sc.nextInt();
			add(a,b);
			break;
		}
		case 2:{
			System.out.println("enter a");
	        int a=sc.nextInt();
	        System.out.println("enter b");
	        int b=sc.nextInt();
			mul(a,b);
			break;
		}
		case 3:{
			System.out.println("enter a");
	        int a=sc.nextInt();
	        System.out.println("enter b");
	        int b=sc.nextInt();
			division(a,b);
			break;
		}
		case 4:{
			System.out.println("enter a");
	        int a=sc.nextInt();
	        System.out.println("enter b");
	        int b=sc.nextInt();
			sub(a,b);
			break;
		}
		case 5:
		{
			System.out.println("enter a");
	        int a=sc.nextInt();
	        System.out.println("enter b");
	        int b=sc.nextInt();
			mod(a,b);
			break;
		}
		}
	}
    public static void add(int a,int b)
    {   
    	System.out.println((a+b));
    }
    public static void mul(int a,int b)
    {
    	System.out.println((a*b));
    }
    public static void division(int a,int b)
    {
    	System.out.println((a/b));
    }
    public static void sub(int a,int b)
    {
    	System.out.println((a-b));
    }
    public static void mod(int a,int b)
    {
    System.out.println((a%b));
    }
   
    
}
