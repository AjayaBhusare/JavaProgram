package exp;

public class EvenSum {

	public static void main(String[] args) {
	
		int num=20;
    	int sum=0;
		for(int i=2;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
