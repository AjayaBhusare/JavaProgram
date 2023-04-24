package string;

public class Q48ConvertEachCharIntoUpperCase {

	public static void main(String[] args) {
	
		String s="raj,kajal,poOja,ram,sita";

		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
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
