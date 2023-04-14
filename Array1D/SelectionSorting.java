package array;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] arr= {12,9,34,65,7,56,45};
		int min;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}	
		}
		 for(int i=0;i<arr.length;i++)
         {
        	 System.out.print(arr[i]+" ");
         }
	}

}
