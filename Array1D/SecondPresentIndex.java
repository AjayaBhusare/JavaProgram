package array;

public class SecondPresentIndex {

	public static void main(String[] args) {
	int[] arr= {2,4,5,4,2,6,5};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]+" is present at index number "+j);
			}
		}
	}

	}

}
