package string;

public class Q46UpperCaseCount {

	public static void main(String[] args) {
	
		String st="My NamE iS AjAyA";
		int count=0;
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				count++;
			}
		}
		System.out.println("number of upper case are "+count);

	}

}
