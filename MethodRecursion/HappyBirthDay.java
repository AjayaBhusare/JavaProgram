package mthodRecursion;

public class HappyBirthDay {

	public static void main(String[] args) {
	call(5);

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
			System.out.println("Happy Birthday");
		}
	}

}
