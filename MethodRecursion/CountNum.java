package mthodRecursion;

public class CountNum {
	static int count=0;
	public static void main(String[] args) {
		int start=15;
		int end=40;
	    count(start,end);

	}
	public static void count(int start,int end)
	{
		if(start==end)
		{	
		 System.out.println(count);
		 return ;
		}
		else if(start<end)
		{
		  count++;
		  count(start+1,end);
		}
		else if(start>end)
		{
		  count--;
		  count(start-1,end);
		}
	}
}
