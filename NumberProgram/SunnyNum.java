package demo;

public class SunnyNum {

	public static void main(String[] args) {
     int num=8;
     int num1=num+1;
     
     for(int i=num/2;i>1;i--)
     {
    	 if((i*i)==num1)
    	 {
    	 System.out.println(num+" is sunny number");
    	 break;
    	 }
     }

	}

}
