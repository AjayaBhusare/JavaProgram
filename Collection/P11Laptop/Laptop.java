package collection;

public class Laptop {

	int ram;
	double price;
	String name;
	public Laptop(int ram, double price,String name) {
		super();
		this.ram = ram;
		this.price = price;
		this.name=name;
	}
	@Override
	public String toString() {
		
		System.out.println("NAME : "+name);
		System.out.println("RAM : "+ram);
		System.out.println("PRICE : "+price);
		return "";
	}
	
	
}
