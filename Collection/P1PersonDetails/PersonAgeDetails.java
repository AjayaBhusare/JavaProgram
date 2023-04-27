package collection;

import java.util.ArrayList;

public class PersonAgeDetails {

	public static void main(String[] args) {
		
		Person p1 = new Person(34, "ajaya");
		Person p2= new Person(25, "ram");
		Person p3 = new Person(36, "kajal");
        Person p4 = new Person(22, "veena");
        
        ArrayList<Person> al = new ArrayList<Person>();
        
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        
        for(Person p:al)
        {
        	if(p.age%2==0)
        	{
        	 System.out.println(p);	
        	}
        }
	}

}
