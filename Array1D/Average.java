package array;

public class Average {

	public static void main(String[] args) {
       int sum=0;
		int count=0;
		int[] arr= {1,2,3,4,5,6,7,8,9,18};

		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			count++;
		}
	    int avg=sum/count;
	    System.out.println(avg);

	}

}
