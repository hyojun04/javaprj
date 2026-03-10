package inheritance_7;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	abstract double calcArea();
}
