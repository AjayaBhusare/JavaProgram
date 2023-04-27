package collection;

import java.util.ArrayList;

public class P811th12thmarks {

	public static void main(String[] args) {
		ArrayList<String> al3 = new ArrayList<String>();
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("physics");
		al1.add("chemistry");
		al1.add("Biology");
		al1.add("Geography");

		
       ArrayList<String> al2 = new ArrayList<String>();
		al2.add("physics");
		al2.add("chemistry");
		al2.add("Biology");
		al2.add("Geography");
		
		if(al2.containsAll(al1)){
			System.out.println("same subject in 11th and 12th");}
		else {System.out.println("different subject");}
		
		al3.addAll(al2);
		al3.addAll(al1);
		
		System.out.println(al3);
		
		for(Object o:al3)
		{
			System.out.println(o);
		}
		System.out.println("Tatol number of Subject learn "+al3.size());
	}

}
