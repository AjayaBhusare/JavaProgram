package string;

public class Q38SplitStringInParticularPart {

	public static void main(String[] args) {
	
		  String st="java is a programming language";
			
			String[] ch=st.split("a");
			
        
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]+" ");
			}


	}

}
