package nestedif;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter a marks");
	    int marks=sc.nextInt();
       
	    	if(marks>80)
	    	{
	    		System.out.println("Distinction");
	    	}
	    	else if(marks<80 && marks>60)
	    	{
	    		System.out.println("first class");
	    	}
	    	else if(marks<60 && marks>35)
	    	{
	    		System.out.println("Second class");
	    	}
	    	else if(marks<35)
	    	{
	    		System.out.println("failed");
	    	}
	    sc.close();
	}

}
