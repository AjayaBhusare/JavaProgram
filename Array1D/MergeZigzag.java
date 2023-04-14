package array;

public class MergeZigzag {

	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int[] b= {2,4,6,8};
		 int x=0;
	     int y=0;
	     
	     int[] c=new int[a.length+b.length];
	    
	     for(int i=0;i<c.length;i++)
	     {
	     if(x<a.length)
	     {
	    	 c[i]=a[x];
	    	 x++;
	    	 i++;
	     }
	     if(y<b.length)
	     {
	    	 c[i]=b[y];
	    	 y++;
	     }
	  }
	   
	     for(int i=0;i<c.length;i++)
	     {
	    	 System.out.print(c[i]+" ");
	     }
	}
}
