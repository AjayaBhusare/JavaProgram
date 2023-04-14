package array;

public class Product {

	public static void main(String[] args) {

		int arr[]= {3,5,6,4,8};
		
		for(int i=0;i<arr.length;i++)
		{
			int prod=1;
		   for(int j=arr[i];j!=0;j--)
		   {
			prod=prod*j;
		   }
			System.out.println(prod);
		}
		

	}

}
