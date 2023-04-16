package demo;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enter a number");
		int sum=r.nextInt();
		r.close();
		
		while(square(sum)>=2)
		{
			sum=square(sum);
			System.out.println(sum);
		if(sum==10 || sum==100)
		{
			System.out.println("Happy Number");
		}
		else if(sum<10)
		{
			System.out.println("not a Happy Number");
			break;
		}

	}

}
public static int square(int num)
{
	int sum=0;
	while(num!=0)
	{
		sum=sum+((num%10)*(num%10));
		num=num/10;
	}
	return sum;
}
}
