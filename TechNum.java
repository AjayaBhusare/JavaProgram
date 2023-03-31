package demo;

public class TechNum {

	public static void main(String[] args) {
		
		int num=2025;
		int digit=0;
		int rev=0;
		for(int i=num;i!=0;i=i/10)
		{
			digit++;
			rev=rev*10+(i%10);
		}
		
		if(digit%2==0)
		{
			int lhs=0;
			int rhs=0;
			for(int i=1;i<=digit;i++)
			{
				if(i<=digit/2)
				{
				lhs=lhs*10+(rev%10);
				}
				else 
				{
				rhs=rhs*10+(rev%10);	
				}
				rev=rev/10;
			}
				int sum=lhs+rhs;
				int square=sum*sum;
				if(num==square)
				{
					System.out.println("tech number");
				}
				else
				{
					System.out.println("not tech number");
				}
		}
		else
		{
			System.out.println("number contain odd number of digit");
		}

	}

}
