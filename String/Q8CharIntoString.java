package string;

public class Q8CharIntoString {

	public static void main(String[] args) {
	
		char[] ch= {'a','b','c','d','e'};
		//WAY1
		String s1=String.valueOf(ch);
		System.out.println(s1);
	   //WAY2
		String s2=new String(ch);
		System.out.println(s2);
		//WAY3
		String st=new String();
		for(int i=0;i<ch.length;i++)
		{
			st=st+ch[i];
		}
		System.out.println(st);
	}

}
