package collection;

import java.util.HashSet;
import java.util.Iterator;

public class P3ProdOfObjectValue {

	public static void main(String[] args) {
	int prod=1;
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(4);
		hs.add(6);
        hs.add(9);
        hs.add(3);
        
//        for(Object o:hs)
//        {
//         System.out.print(o+" ");
//        }
        Iterator<Integer> i=hs.iterator();
        while(i.hasNext())
        {
        	prod*=i.next();
        }
        System.out.println("Product is : "+prod);
	}

}
