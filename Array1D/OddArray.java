package array;

public class OddArray {

	public static void main(String[] args) {
       int a[]= {1,3,2,4,5,67,8,9,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
