package array;

public class Sum10 {

	public static void main(String[] args) {
    int[] arr= {2,8,3,5,5,3,7};
   
    for(int i=0;i<arr.length;i++) {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[i]+arr[j]==10)
    		{
    			System.out.println("sum of"+arr[i]+" And "+arr[j]+" is 10 ");
    		}
    	}
    }
  

	}

}
