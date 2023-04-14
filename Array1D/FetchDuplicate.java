package array;

public class FetchDuplicate {

	public static void main(String[] args) {

		int[] a = { 2, 7, 8, 9, 8, 2, 9 };
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = i; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count!=1) {
				System.out.println(a[i]);
			}
		}
		
	}
}
