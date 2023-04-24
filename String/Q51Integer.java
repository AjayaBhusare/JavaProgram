package string;

public class Q51Integer {

	public static void main(String[] args) {
		
		String s="12345";
		String st="";
		for(int i=0;i<s.length();i++)
		{
		  if (s.charAt(i)>'0'&& s.charAt(i)<'9')
		  {
			st=st+s.charAt(i); 
		  }
		  else
		  {
			break;  
		  }
		}
		System.out.println(st);
	}

}
