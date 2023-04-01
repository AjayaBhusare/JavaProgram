package demo;

public class XylemPhloem {

	public static void main(String[] args) {
		
		int num=12124;
		int ld=num%10;
		int fd=0;
		int md=0;
		for(int i=num/10;i>0;i=i/10)
		{
			if(i>10)
			{
			 md=md+i%10;
			}
			else
			{
			fd=i%10;	
			}
		}
		int ex=ld+fd;
		if(ex==md)
		{
			System.out.println(num+" is xylem");
		}
		else
		{
			System.out.println(num+" is Phloem");
		}

	}

}
