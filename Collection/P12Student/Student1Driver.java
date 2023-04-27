package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Student1Driver {

	public static void main(String[] args)
	{
	 Student1 st1 = new Student1(5, 23, "gita");
	 Student1 st2 = new Student1(3, 45,"sita");
     Student1 st3 = new Student1(7, 34, "babita");
     Student1 st4 = new Student1(9, 27, "lalita");
     Student1 st5 = new Student1(2, 21, "sangita");
     
     
     TreeSet<Student1> ts = new TreeSet<Student1>(new Comparator<Student1>() {

		@Override
		public int compare(Student1 o1, Student1 o2) {
			return o1.age-o2.age;
			//return o1.name.compareTo(o2.name);
		}
	});
     
     ts.add(st1);
     ts.add(st2);
     ts.add(st3);
     ts.add(st4);
     ts.add(st5);
     
     for(Student1 st:ts)
     {
    	 System.out.println(st);
     }
	}

}
