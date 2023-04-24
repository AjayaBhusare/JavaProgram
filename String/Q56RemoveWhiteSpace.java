package string;

public class Q56RemoveWhiteSpace {

	public static void main(String[] args) {
	
		String st1=" hello good morning all of you";
		
		String[] ch=st1.split(" ");
		

		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
