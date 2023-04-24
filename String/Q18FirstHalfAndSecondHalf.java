package string;

public class Q18FirstHalfAndSecondHalf {

	public static void main(String[] args) {
	
		String st="ajAyaBhuSaRe";
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(i<(st.length()/2))
			{
				if(st.charAt(i)>='a' && st.charAt(i)<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else
			{
				if(st.charAt(i)>='A'&& st.charAt(i)<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		//for (char c : ch) {
		//	System.out.print(c+" ");
		//}
	}
}
