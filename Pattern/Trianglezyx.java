package patternpro;

public class Trianglezyx {

	public static void main(String[] args) {
		
		char ch='z';
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch--+" ");
			}
			System.out.println();
		}

	}

}
