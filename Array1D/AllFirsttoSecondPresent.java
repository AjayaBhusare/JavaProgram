package array;

public class AllFirsttoSecondPresent {

	public static void main(String[] args) {
		int a1[]= {10,20,30,40};
		int a2[]= {10,20,30,80,40,50,70};
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
			System.out.println("present"); 
		 }
		else
		{
			System.out.println("not present");
		}
	}

}
