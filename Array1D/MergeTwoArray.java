package array;

public class MergeTwoArray {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5};//length=5
	int[] b= {6,7,8,9};//length=4
	
     int[] c=new int[a.length+b.length];//5+4=9
     
     for(int i=0;i<a.length;i++)
     {
    	 c[i]=a[i];
     }//{1,2,3,4,5,0,0,0,0}
     for(int i=0;i<b.length;i++)
     {
    	 c[i+a.length]=b[i];
     }
     for(int i=0;i<c.length;i++)
     {
    	System.out.print(c[i]+" ");
     }
	}

}
