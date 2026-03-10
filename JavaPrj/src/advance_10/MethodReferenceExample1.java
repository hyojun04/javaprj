package advance_10;

import java.util.function.Function;

public class MethodReferenceExample1 {
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
	
	public static void main(String[] args) {
		Function<String, String> lambda = (str) -> toUpperCase(str);
		
		Function<String, String> reference = 
				MethodReferenceExample1 :: toUpperCase;
		
		System.out.println(lambda.apply("hello"));
		System.out.println(reference.apply("world"));
	}

}
