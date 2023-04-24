package string;

public class Q20StringInbuildMethod {

	public static void main(String[] args) {
	

		String st="auToMatiOn tEstiNg";
		
		System.out.println(st.length());
		String s=st.replace('a', 'e');
		String st1=st.toUpperCase();
		String st2=st.toLowerCase();
		String[] st3=st.split("i");
		
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(s);
	}

}
