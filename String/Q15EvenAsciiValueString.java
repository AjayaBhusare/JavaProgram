package string;

public class Q15EvenAsciiValueString {

	public static void main(String[] args) {
		
		String st="automation";
	
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			int ascii=st.charAt(i);
			if(ascii%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
