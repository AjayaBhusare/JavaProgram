package nestedif;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a username");
	    String username=sc.nextLine();
	    System.out.println("enter a password");
	    String password=sc.nextLine();
	   
	    if(username.equals("ajaya"))
	    {
	    	if(password.equals("ajaya123"))
	    	{
	    		System.out.println("Login Successfully");
	    		 System.out.println("____welcome to InstaGram_________");
	    	}
	    	else
	    	{
	    		System.out.println("invalid Password");
	    	}
	    }
	    else
	    {
	    	System.out.println("invalid username and password");
	    }
	    sc.close();
	}

}
