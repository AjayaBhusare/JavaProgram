package string;

public class Q55RemoveDuplicatekept1asisit {

	public static void main(String[] args) {

		String st="AjayA";
		st=st.toLowerCase();
		
		String st1="";
       for(int i=0;i<st.length();i++)
       {
    	   if(st1.contains(st.charAt(i)+""))
    	   {
    		   continue;
    	   }
    	   else
    	   {
    		   st1+=st.charAt(i);
    	   }
       }
       System.out.println(st1);
	}

}
