package array;

public class MultiplesElement {

	public static void main(String[] args) {
		
		int[] a= {2,5,12,3,6,15,18,21};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
					count++;
				}
			}
			System.out.println("there are "+count+" multiple number of 2 ");			
	}

}
