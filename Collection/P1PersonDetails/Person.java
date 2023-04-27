package collection;

public class Person implements Comparable<Person> {

	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	 
	public String toString()
	{
		System.out.println("AGE : "+age);
		System.out.println("NAME : "+name);
		return "";
	}

	@Override
	public int compareTo(Person o) {
		return this.age-o.age;
	}
	
}
