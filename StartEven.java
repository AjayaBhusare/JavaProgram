package demo;

public class StartEven {

	public static void main(String[] args) {
	 int num=6432;
	 int rem=0;
	 for(int i=num;i!=0;i=i/10)
	 {
		  rem=i%10;
	 }
		 
		 if(rem%2==0)
		 {
			 System.out.println(num+" is started with even");
		 }
		 else
		 {
			 System.out.println("not started with even");
		 }
	

	}

}
