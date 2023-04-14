package array;

public class TwoArrayIdenticalOrNot {

	public static void main(String[] args) {
		int a1[]= {10,20,30,40};
		int a2[]= {30,40,10,20};
		int count=0;
		for(int i=0;i<a1.length;i++)
		{ 
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
				 	count++;
				}		
			}
		}
			if(count==a1.length)
			{
				System.out.println("identical");
			}
			else
			{
				System.out.println("not identical");
			}

	}

}
