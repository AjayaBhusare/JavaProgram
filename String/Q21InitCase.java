package string;

public class Q21InitCase {

	public static void main(String[] args) {
	
		String s="java iS A ProGramming Language.";
		
	     s=s.toLowerCase();
		String[] st2=s.split(" ");
		
		for(int i=0;i<st2.length;i++)
		{
		    char fc=st2[i].charAt(0);
	
		    String c1=String.valueOf(fc).toUpperCase();
		    String sub=st2[i].substring(1);
			System.out.print(c1+sub+" ");
		}

	}

}
