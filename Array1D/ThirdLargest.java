package array;

public class ThirdLargest {

	public static void main(String[] args) {
		int[] arr= {49,56,43,67,89,23,13};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Third largest element is "+arr[2]);

	}

}
