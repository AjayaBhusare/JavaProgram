package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class LaptopDriver {

	public static void main(String[] args) {
	
        Laptop l1 = new Laptop(8, 3455.544, "Hp");
        Laptop l2 = new Laptop(4, 5675.45, "mac");
        Laptop l3 = new Laptop(16, 45673.56, "lenovo");
        Laptop l4 = new Laptop(8, 35746.567, "asus");
        Laptop l5 = new Laptop(4, 23454.545, "Dell");
        
       TreeSet<Laptop> ts = new TreeSet<Laptop>(new Comparator<Laptop>() {

		@Override
		public int compare(Laptop o1, Laptop o2) {
			//return o1.ram-o2.ram;
			return (int) (o1.price-o2.price);
		}
	}); 
     ts.add(l1);
     ts.add(l2);
     ts.add(l3);
     ts.add(l4);
     ts.add(l5);
     
       for(Laptop l:ts)
       {
    	   System.out.println(l);
       }
	}

}
