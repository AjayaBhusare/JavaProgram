package collection;

public class Menu implements Comparable<Menu> {

	String name;
	Double price;
	public Menu(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Menu o) {
		
		return (int) (this.price-o.price);
	}
	
	

}
