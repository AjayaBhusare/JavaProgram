package array;

public class CommonElementBetTwoArray {

	public static void main(String[] args) {
		int a1[]= {10,20,30,40};
		int a2[]= {10,60,30,80,90};
		
		for(int i=0;i<a1.length;i++)
		{  
			boolean flag =false;
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
				 flag=true;	
				}		
			}
			if(flag)
			{
				System.out.println(a1[i]);
			}	
		}
		for(int i=0;i<a2.length;i++)
		{  
			boolean flag =true;
			for(int j=0;j<a1.length;j++)
			{
				if(a2[i]==a1[j])
				{
				 flag=false;	
				}		
			}
			if(flag==false)
			{
				System.out.println(a2[i]);
			}
		}
		
		}

	}


