package array;

public class WithoutTemp {

	public static void main(String[] args) {
	 int[] arr= {12,43,54,65,43,87,23,11};
	 
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 arr[i]=arr[i]+arr[j];
				 arr[j]=arr[i]-arr[j];
				 arr[i]=arr[i]-arr[j];
			 }
		 }
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }

	}

}
