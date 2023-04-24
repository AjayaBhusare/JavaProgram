package string;

public class Q11NumberOfWord {

	public static void main(String[] args) {
	
		String st="Hi Friends how are you";
		int count=1;
		for(int i=0;i<st.length()-1;i++)
		{
		   if((st.charAt(i)==' ')&&(st.charAt(i+1)!=' '))
		   {
			count++;
		    }
		}
		System.out.println("number of Word in String --->"+count);
	}

}
