package mthodRecursion;

public class Welcome {

	public static void main(String[] args) {
		int n=10;
		call(n);
	}
	public static void call(int n)
	{
		if(n==0)
		{
		 System.out.print("");
		}
		else
		{
		  call(n-1);
		  System.out.println("welcome");
		}
	}

}
