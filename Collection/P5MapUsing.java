package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class P5MapUsing {

	public static void main(String[] args) {
	
		HashMap<String,Double> m = new HashMap<String,Double>(); 
        
		m.put("English",85.45 );
		m.put("math", 65.45);
		m.put("marathi", 95.43);
		m.put("hindi", 85.45);
		m.put("physics", 68.24);
		m.put("chemistry", 67.45);
		m.put("electronics", 76.45);
		m.put("Biology", 77.45);
		m.put("history", 65.45);
		m.put("geography", 81.20);
		
		System.out.println(m);
		
		Set set=m.entrySet();
		System.out.println(set);
		
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(Entry<String, Double> c:m.entrySet())
		{
			System.out.println(c.getKey()+"---->"+c.getValue());
		}
	}

}
