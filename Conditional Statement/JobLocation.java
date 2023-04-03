package decisionMaking;

import java.util.Scanner;

public class JobLocation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();
		System.out.println("enter a sex");
		String sex=sc.next();
		System.out.println("enter a marital status");
		char maritalSt=sc.next().charAt(0);
		sc.close();
		
		if((age>=21 && age<=34 ) || sex=="male" || maritalSt=='u')
		{
			System.out.println("Job location is Bengaluru");
		}
		else if((age>=35 && age<=50) || sex=="female" || maritalSt=='m')
		{
			System.out.println("Job location is pune");
		}
		else if((age>=21 && age<=34) || sex=="female" || maritalSt=='u')
		{
			System.out.println("Job location is mumbai");
		}
		else
		{
			System.out.println("out of india");
		}
		

	}

}
