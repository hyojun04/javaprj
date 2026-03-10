package inheritance_7;

public class Circle extends Shape{
	private int r;
	
	public Circle(String name, int r) {
		super(name);
		this.r = r;
	}
	
	@Override
	public double calcArea() {
		return r * r*Math.PI;
	};
}
