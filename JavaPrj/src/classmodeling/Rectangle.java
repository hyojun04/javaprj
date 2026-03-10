package classmodeling;

public class Rectangle {
	public static int count =0;
	private int width;
	private int height;
	private int area;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width*height;
	}
	
	public void setWidth(int width) {
		this.width = width;
		setArea();
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
		setArea();
	}
	
	public int getHeight() {
		return height;
	}
	
	private void setArea() {
		this.area = width*height;
	}
	
	public int getArea() {
		return area;
	}
	
}
