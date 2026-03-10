package defaultAPIclass_12;

public class RegularExpressionExample {

	public static void main(String[] args) {
		String str1 = "HelloWorld";
		if(str1.matches("HelloWorld")) {
			System.out.println("HelloWorld");
		}
		if(str1.matches("Hello.....")) {
			System.out.println("Hello.....");
		}
		if(str1.matches("Hel+oWorld")) {
			System.out.println("Hel+oWorld");
		}
		
		str1 = "NiceWorld";
		if(str1.matches("(Hello|Nice)World")) {
			System.out.println("(Hello|Nice)World");
		}
		if(str1.matches("\\w*")) {
			System.out.println("_를 포함 한 영숫자");
		}
		if(str1.matches("\\W*")) {
			System.out.println("_를 포함 한 영숫자가 아님");
		}else {
			System.out.println("_를 포함 한 영숫자");
		}
	}

}
