package string;

public class Q28CharWithOccurance {

	public static void main(String[] args) {
      
		String st="automatioan";
	    char[] ch=st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			int count=1;
			for (int j = i+1; j < st.length(); j++) {
				
				if (ch[i]==ch[j]) 
				{
					count++;
					ch[j]='@';
				}
			}
			if (ch[i]!='@'&& count>1) 
			{
				System.out.println(ch[i]+"----> "+count);
			}
		}
	}
}
