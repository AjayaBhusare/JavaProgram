package collection;

import java.util.HashSet;
import java.util.Set;

public class P7CityNameSet {

	public static void main(String[] args) {
	
		Set<String> hs = new HashSet<String>();

		hs.add("Nashik");
		hs.add("Pune");
		hs.add("Bangalore");
		hs.add("Dhule");
		hs.add("satara");
		
		for(Object o:hs)
		{
			System.out.print(o+" ");
		}
	}

}
