package patternpro;

public class TriangleZZY {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			char ch='Z';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch--+" ");
			}
			System.out.println();
		}

	}

}
