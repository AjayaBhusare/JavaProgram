package string;

public class Q45Space {

	public static void main(String[] args) {
		
		String st=" my name is je nny ";
        int count=0;
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ') 
			{
				count++;
			}
		}
		System.out.println("number of Space is "+count);
	}

}
