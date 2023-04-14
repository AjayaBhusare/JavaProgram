package array;

public class Remove {

	public static void main(String[] args) {
		
		int[] arr= {1,3,4,5,2};
		int x=0;
		int[] brr=new int[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			if(i!=3)
			{
			 brr[x++]=arr[i];	
			}
		}
		for(int j=0;j<brr.length;j++)
		{
			System.out.println(brr[j]);
		}

	}

}
