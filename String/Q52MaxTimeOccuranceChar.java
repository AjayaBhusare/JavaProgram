package string;

public class Q52MaxTimeOccuranceChar {

	public static void main(String[] args) {
	
		String st="automatioAn";
		st=st.toLowerCase();
		int max=0;
		for (int i = 0; i < st.length(); i++) {
			int count=0;
			for (int j = 0; j < st.length(); j++) {
				
				if (st.charAt(i)==st.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
		    {
			 max=count;
			 System.out.println(st.charAt(i)+"---->"+max);		 
			}
		} 
	}

}
