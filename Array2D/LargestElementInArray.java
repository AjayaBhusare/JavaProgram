package array2d;

public class LargestElementInArray {

	public static void main(String[] args) {
	
		int[][] a= {{9,4,7,19,31},{5,7,2,87,56},{97,76,54,34}};
		
		int large=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>large)
				{
					large=a[i][j];
				}
			}
		}
        System.out.println(large);
	}

}
