package string;

public class Q32RemoveTheSpace {

	public static void main(String[] args) {
	
		String s1="  raj is good boy";
		int count=0;
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' '){
			  count++;
			}
			else{
				break;
			}
		}
		System.out.println(count);
		 for(int i=count;i<s1.length();i++)
		 {
			s2=s2+s1.charAt(i); 
		 }
		 System.out.println(s2);
	}
}
