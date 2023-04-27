package collection;

import java.util.TreeSet;

public class MenuDriver {

	public static void main(String[] args) {
	
		Menu m1 = new Menu("panner", 45.35);
		Menu m2 = new Menu("vada pav", 15.00);
		Menu m3 = new Menu("samosa", 40.32);
		Menu m4 = new Menu("pav bhaji", 150.45);
		Menu m5 = new Menu("Misal", 100.00);
		
		TreeSet<Menu> ts = new TreeSet<Menu>();
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		ts.add(m5);
		
		for(Menu m:ts)
		{
			System.out.println(m);
		}
	}

}
