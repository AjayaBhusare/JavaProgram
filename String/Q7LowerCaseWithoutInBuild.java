package string;

public class Q7LowerCaseWithoutInBuild {

	public static void main(String[] args) {
	
		String st="I AM FROm NASHIK";
		
		char[] ch=st.toCharArray();
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)ch[i];
			}
		}
       for(int i=0;i<ch.length;i++)
       {
    	   System.out.print(ch[i]);
       }
	}

}
