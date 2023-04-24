package string;

public class Q58SwappingWith3rd {

	public static void main(String[] args) {
	
		String a="Jeon";
		String b="jungkook";
		String temp="";
		System.out.println("before Swapping-----> "+a+b);
		
		temp=a;
		a=b;
		b=temp;

		System.out.println("After Swapping-----> "+a+b);
	}

}
