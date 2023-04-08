package mthodRecursion;

public class Factorial {

	public static void main(String[] args) {
		int n=4;
		System.out.println(factorial(n));

	}
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
		 return n*factorial(n-1);//4*fact(4-1)-->3*fact(3-1)-->
		}
	}

}
