package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class PizzaDriver {

	public static void main(String[] args) {
	
		Pizza p1 = new Pizza(5, 180.99, "cheese Pizza");
		Pizza p2 = new Pizza(7, 120.45, "peri-peri Pizza");
		Pizza p3 = new Pizza(9, 2209.66, "corn Pizza");
		Pizza p4 = new Pizza(12, 500.34, "tomato Pizza");
		Pizza p5 = new Pizza(3, 800.56, "meat Pizza");
	
	
	 TreeSet<Pizza> ts = new TreeSet<Pizza>();
 
	 ts.add(p1);
	 ts.add(p2);
	 ts.add(p3);
	 ts.add(p4);
	 ts.add(p5);
	 
	 Iterator<Pizza> i=ts.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}	  
}
