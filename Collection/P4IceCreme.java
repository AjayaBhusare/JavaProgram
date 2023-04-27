package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class P4IceCreme {

	public static void main(String[] args) {
	
		LinkedList<String>li = new LinkedList<String>();

		li.add("chocolate");
		li.add("stawberry");
		li.add("vanilla");
		li.add("mint");
		li.add("chocolate chip");
		li.add("mango");
		li.add("banana");
		
		Iterator<String> i=li.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}

}
