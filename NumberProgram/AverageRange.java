package exp;

import java.util.Scanner;

public class AverageRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting range");
		int start=sc.nextInt();
		System.out.println("enter the end range");	
		int end=sc.nextInt();
		sc.close();
		int count=1;
		int sum=0;
		for(int i=end;i>=start;i--)
		{
			count++;
			int rem=i%10;
			sum=sum+rem;
			
		}
		System.out.println(sum/count);

	}

}
