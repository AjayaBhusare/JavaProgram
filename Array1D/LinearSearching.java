package array;

public class LinearSearching {

	public static void main(String[] args) {
		
		int[] arr= {3,5,7,2,8,4,9};
		int item=7;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				System.out.println(item+" is present at "+i+" index position");
				temp=temp+1;
			}
		}
         if(temp==0)
         {
        	 System.out.println("item not found");
         }
	}

}
