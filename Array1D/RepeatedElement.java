package array;

public class RepeatedElement {

	public static void main(String[] args) {
	
		int[] arr= {10,20,60,50,20,60};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
