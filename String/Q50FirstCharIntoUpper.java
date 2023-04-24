package string;

public class Q50FirstCharIntoUpper {

	public static void main(String[] args) {
		String st="i am going to college";
		
		String[] st2=st.split(" ");
		
		for(int i=0;i<st2.length;i++)
		{
			char ch=st2[i].charAt(0);
			//way1
			String c1=String.valueOf(ch).toUpperCase();
			String sub=st2[i].substring(1);
			System.out.print(c1+sub+" ");
		}

	}

}
