package string;

public class Q25OddLowerEvenUpper {

	public static void main(String[] args) {
	
		String st="aUtoMatioN";
		String res="";
		for(int i=0;i<st.length();i++)
		{
			if(i%2==0)
			{
		     res=res+st.toLowerCase().charAt(i);
			}
			else
			{
			 res=res+st.toUpperCase().charAt(i);
			}
		}
		System.out.println(res);
	}

}
