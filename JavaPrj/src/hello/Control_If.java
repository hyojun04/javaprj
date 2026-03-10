package hello;

public class Control_If {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10);
		System.out.println("a: "+a);
		char b = switch(a) {
		case 9,8 -> 'A';
		case 7,6, 5 ->{
			System.out.println("7,6,5 입니다.");
			yield 'B';
		}
		default -> 'C';
		};
		System.out.println(b);
	}
}
