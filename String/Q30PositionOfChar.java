package string;

public class Q30PositionOfChar {

	public static void main(String[] args) {
	
		String st="automation";
	    char a='t';
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==a)
			{
				System.out.println(i);
			}
		}

	}

}
