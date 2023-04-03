package nestedif;

import java.util.Scanner;

public class Tshirt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a t-shirt amount");
	    int price=sc.nextInt();
        
	    if(price<10000 && price>5000)
	    {
	    System.out.println("get 50% discount");
	    }
	    else if(price>2000 && price<4000)
	    {
	    	System.out.println("get 25% discount");
	    }
	    else
	    {
	    	System.out.println("Sorry ,no any Discount");
	    }
	    sc.close();
	}

}
