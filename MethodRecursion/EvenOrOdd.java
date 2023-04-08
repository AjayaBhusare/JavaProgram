package mthodRecursion;

public class EvenOrOdd {

	public static void main(String[] args) {
	
		evenodd(15,1);

	}
	public static void evenodd(int n,int end)
	{
		if(n==end)
		{
			return;
		}
		else
		{
			if(n%2==0)
			{
				System.out.println(n+" = even");
			}
			else
			{
				System.out.println(n+" = odd");
			}
			n--;
			evenodd(n,end);
		  
		}
	}

}
