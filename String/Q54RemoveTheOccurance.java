package string;

public class Q54RemoveTheOccurance {

	public static void main(String[] args) {
	
		String st="automation testing";
		char ch='t';
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=ch)
			{
				System.out.print(st.charAt(i));
			}
		}
	}

}
