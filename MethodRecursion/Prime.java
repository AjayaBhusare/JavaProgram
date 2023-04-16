package mthodRecursion;

public class Prime {
	static int count = 0;

	public static void main(String[] args) {
		int num = 11;
		int i=2;
		if(prime(num,i))
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

	public static boolean prime(int num,int i) {
		if(num==0 ||num==1)//edge condition
		{
			return false;
		}
		if(num==i)//checking condition
		{
			return true;
		}
        if(num%i==0)//base condition
        {
        	return false;
        }
       return prime(num,i+1);
}
	

}
