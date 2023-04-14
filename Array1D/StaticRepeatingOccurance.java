package array;

public class StaticRepeatingOccurance {

	public static void main(String[] args) {
		
       int[] a = { 2, 7, 8, 9, 8, 2, 9,7,2,1};
		int num=2;
		int count=0;
		for (int i = 0; i < a.length; i++) {
				if (num==a[i]) 
				{
					count++;
				}
			}
		System.out.println(num+"----> "+count);
		}

	}

