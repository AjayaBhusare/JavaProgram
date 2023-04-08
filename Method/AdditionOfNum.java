package method;

import java.util.Scanner;

public class AdditionOfNum {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the value num");
	 int num=sc.nextInt();
	 System.out.println("enter the value num1");
	 int num1=sc.nextInt();
	 sc.close();
	 System.out.println(add(num,num1));
	}
  public static int add(int a,int b)
  {
	  int res=a+b;
	  return res;
  }
  
}
