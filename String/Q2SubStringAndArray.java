package string;

public class Q2SubStringAndArray {

	public static void main(String[] args) {
	
		String st1="ajayabhusare";
		int count=0;
	   String  st2=st1.substring(1, 8);
	     char[] st=st2.toCharArray();
	    for(int i=0;i<st.length;i++)
	    {
		count++;
	    }
	    System.out.println("number present is "+count);
	}

}
