package string;

public class Q49StringEmptyOrNot {

	public static void main(String[] args) {
	
		String st="";
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			count++;
		}
       if(count==0)
       {
    	   System.out.println("String is empty");
       }
       else
       {
    	   System.out.println("String is not empty");
       }
	}

}
