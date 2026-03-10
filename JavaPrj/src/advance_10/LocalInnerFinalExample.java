package advance_10;

public class LocalInnerFinalExample {

	public static void main(String[] args) {
		Button b1 = new Button("Red");
		b1.action(100);
		b1.action(200);
		System.out.println();
		
		Button b2 = new Button("Blue");
		b2.action(300);
		
	}

}
