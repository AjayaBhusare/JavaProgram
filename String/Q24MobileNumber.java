package string;

import java.util.Scanner;

public class Q24MobileNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mobile number");
		String st=sc.nextLine();
		String st2="";
		if(st.length()==10)
		{
		 for(int i=0;i<st.length();i++)
		 {
			 if(i<=3)
			 {
				 st2=st2+st.charAt(i);
			 }
			 else
			 {
				st2=st2+"*";
			 }
		 }
			System.out.print(st2);
		}
		else
		{
			System.out.println("enter valid mobile number");
		}
      sc.close();
	}

}
