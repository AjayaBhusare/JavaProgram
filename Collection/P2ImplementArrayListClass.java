package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P2ImplementArrayListClass {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//add elements
		al.add(1);
		al.add("ram");
		al.add(77.45);
		al.add('X');
		al.add(1);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(0));
		
		System.out.println(al.contains("ram"));
		System.out.println(al.contains("sita"));
		
//		System.out.println(al.remove(2));
//		System.out.println(al.isEmpty());
//		al.clear();
//		System.out.println(al.isEmpty());
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.print(al.get(i)+" ");
//		}
		
//		for(Object o:al)
//		{
//			System.out.print(o+" ");
//		}
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}

}
