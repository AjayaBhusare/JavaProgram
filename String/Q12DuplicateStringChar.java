package string;

public class Q12DuplicateStringChar {

	public static void main(String[] args) {
	
		String st="automation";
	
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
			       System.out.println("Duplicate char in String are :"+st.charAt(j));
				}
			}
		}
	}

}
