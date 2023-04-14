package array;

public class EvenIndex {

	public static void main(String[] args) {
		 int a[]= {1,3,2,4,5,67,8,9,6,8};
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
			}

	}

}
