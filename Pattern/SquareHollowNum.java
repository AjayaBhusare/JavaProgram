package patternpro;

public class SquareHollowNum {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==2 && j==3 || i==4 && j==3)
				{
					System.out.print(" ");
				}
				else if(i==3 && j==2 || i==3 && j==4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}


	}

}
