package operator;

import java.util.Scanner;

public class PoNeConditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		sc.close();
		String res=(num>0)?"num is Positive":"num is Negative";
		System.out.println(res); 

	}

}
