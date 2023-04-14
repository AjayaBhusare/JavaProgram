package array;

public class HightestSumOf2Element {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,5,67,8,9,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]>sum)
				{
					sum=a[i]+a[j];
				    break;
				}
			}
		
		}
		System.out.println(sum);

	}

}
