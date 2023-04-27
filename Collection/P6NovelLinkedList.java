package collection;

import java.util.LinkedList;

public class P6NovelLinkedList {

	public static void main(String[] args) {
	
		LinkedList<String>li = new LinkedList<String>();
		li.add("mahabharat");
		li.add("ramayan");
		li.add("Shyam");
		li.add("gita");
		li.add("the god");
		

		LinkedList<String> li2 = new LinkedList<String>();
		
		li2.addAll(li);
		
		for(Object o:li2)
		{
			System.out.print(o+" ");
		}
	}

}
