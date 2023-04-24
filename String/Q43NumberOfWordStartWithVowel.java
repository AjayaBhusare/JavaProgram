package string;

public class Q43NumberOfWordStartWithVowel {
	
	public static void main(String[] args) {

		String st="hi apple Orange ice elephant nest university";
		char[] ch=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		   if((ch[i]==' ')&&
				          ((ch[i+1]=='A'||ch[i+1]=='a')||
						   (ch[i+1]=='E'||ch[i+1]=='e')||
						   (ch[i+1]=='I'||ch[i+1]=='i')||
						   (ch[i+1]=='O'||ch[i+1]=='o')||
						   (ch[i+1]=='U'||ch[i+1]=='u')))
		   {
			 count++;  
		   }
		   else if((ch[i]==0))
		   {
			 continue;  
		   }
		}
		System.out.println(count);
	}

}


