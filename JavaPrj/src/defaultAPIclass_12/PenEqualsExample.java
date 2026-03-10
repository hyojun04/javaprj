package defaultAPIclass_12;

public class PenEqualsExample {

	public static void main(String[] args) {
		Pen p1 = new Pen("p0001", "빨간팬");
		Pen p2 = new Pen("p0001", "빨간팬");
		System.out.println("p1 ==p2 : "+(p1 ==p2));
		System.out.println("p1.equals(p2) : "+p1.equals(p2));
	}

}
