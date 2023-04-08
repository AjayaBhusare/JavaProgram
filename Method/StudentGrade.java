package method;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a sub1 marks");
			double sub1=sc.nextDouble();
			System.out.println("enter a sub2 marks");
			double sub2=sc.nextDouble();
			System.out.println("enter a sub3 marks");
			double sub3=sc.nextDouble();
			System.out.println("enter a sub4 marks");
			double sub4=sc.nextDouble();
			sc.close();
			percentage(sub1,sub2,sub3,sub4);
			
	}
	 public static void percentage(double a,double b,double c,double d)
	 {
		 double res=((a+b+c+d)/4);
			
		if(res>=35 && res<=49)
		{
			System.out.println("second class");
		}
		else if(res>=50 && res<=75)
		{
			System.out.println("first class");
		}
		else if(res>=76 && res<=100)
		{
			System.out.println("distinction");
		}
		else
		{
			System.out.println("fails");
		}

	 }

}
