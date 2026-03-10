package inheritance_7;

public class Triangle extends Shape{
	private int width;
	private int height;
	
	
	public Triangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return width * height* 0.5;
	};

}
