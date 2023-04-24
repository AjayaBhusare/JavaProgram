package string;

public class Pana {
	public static void main(String[] args) {

		String s1 = "The quick brown fox jumps over the lazy dog";
		s1 = s1.toLowerCase();

		int[] arr = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)>='a'&&s1.charAt(i)<='z') 
			{
				arr[s1.charAt(i) - 97] = 1;
			}
		}
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("panagram");
		} else {
			System.out.println("not panagram");
		}
	}
}
