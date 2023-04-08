package mthodRecursion;

public class FiboD {
     static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.print(a+","+b);
		fibo(10);

	}
	public static void fibo(int i)
	{
		if(i>=3)
		{
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			fibo(i-1);
		}
		
	}

}
