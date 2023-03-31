package loop;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        
        int square=num*num;
        int temp=num;
        int temp1=square;
        int digit=0;
        int sum=0;
        int res=0;
        
        while(temp!=0)
        {
          digit++;	
          temp=temp/10;
        }
       
        for(int i=1;i<=digit;i++)
        {
        	sum=sum*10+(temp1%10);
        	temp1=temp1/10;
        }
        
        while(sum!=0)
        {
        	res=res*10+(sum%10);
        	sum=sum/10;
        }
        
        if(res==num)
        {
        	System.out.println(num+" is a automorphic number");
        }
        else
        {
        	System.out.println(num+" is not Automorphic number");
        }
	}

}
