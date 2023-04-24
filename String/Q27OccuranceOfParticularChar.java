package string;

public class Q27OccuranceOfParticularChar {

	public static void main(String[] args) {
	
		String st="automatian";
        char ch='a';
        int count=0;
        for(int i=0;i<st.length();i++)
        {
        	if(ch==st.charAt(i))
        	{
        	   count++;
        	  //System.out.println(st.charAt(i));
        	}
        }
        System.out.println("Occurance of "+ch+" is "+count+" times");
	}

}
