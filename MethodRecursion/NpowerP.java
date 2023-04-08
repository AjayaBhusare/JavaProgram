package mthodRecursion;

public class NpowerP {

	public static void main(String[] args) {
      int n=5;
      int p=3;
      System.out.println(power(n,p));
	}
	public static int power(int n,int p)
	{
		if(p==1)
		{
			return n;
		}
		else
		{
			return n*power(n,p-1);
		}
	}

}
