package string;

public class Q9UpperCaseWithoutInBuild {

	public static void main(String[] args) {
		
		String st="i am from nasHik";
		char[] ch=st.toCharArray();
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='a' && st.charAt(i)<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
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
