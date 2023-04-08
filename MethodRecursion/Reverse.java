package mthodRecursion;

public class Reverse {
      static int revs=0;
	public static void main(String[] args) {
		int num=1234;
		rev(num);

	}
	public static void rev(int num)
	{
		if(num==0)
		{
			System.out.println(revs);
			return;
		}
		else
		{
			int rem=num%10;
			revs=revs*10+rem;
			rev(num/10);
		}
	}

}
