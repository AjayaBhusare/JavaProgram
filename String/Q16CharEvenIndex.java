package string;


public class Q16CharEvenIndex {

	public static void main(String[] args) {
	
		String st="automation";
		
		for(int i=0;i<st.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(st.charAt(i)+",");
			}
		}
	}

}
