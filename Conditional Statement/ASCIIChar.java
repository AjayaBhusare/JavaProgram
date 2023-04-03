package decisionMaking;

import java.util.Scanner;

public class ASCIIChar {

	public static void main(String[] args) {
	
		Scanner name = new Scanner(System.in);
		System.out.println("enter the charater");
		char ch=name.next().charAt(0);
		name.close();
		
		int ascii=(int)ch;
		System.out.println("ASCII value of "+ch+" is "+ascii);
		
		
	}

}
