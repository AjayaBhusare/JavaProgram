package exp;

import java.util.Scanner;

public class NFiboSeries {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("enter the number");
		int n=name.nextInt();
		name.close();
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		for(int i=1;i<=n;i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
