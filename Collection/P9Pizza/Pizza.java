package collection;

public class Pizza implements Comparable<Pizza> {

	int size;
	double price;
	String name;
	public Pizza(int size, double price, String name) {
		super();
		this.size = size;
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", price=" + price + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Pizza o) {
		return o.size-this.size;
	}
	
	
}
