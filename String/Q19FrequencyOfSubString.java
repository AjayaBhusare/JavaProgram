package string;

public class Q19FrequencyOfSubString {

	public static void main(String[] args) {
	
		String s="hello hello tell them bye bye";
		String[] a=s.split(" ");
		
		  for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = 0; j < a.length; j++) {
				if (a[i].equals(a[j])&&i!=j) {
					count++;
					a[j]="@";
				}
			}
			if (a[i]!="@" && count>=1) {
				System.out.println(a[i]+" freq "+count);
			}
		}
		
	}
}
