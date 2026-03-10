package advance_10;

import java.util.function.Function;

public class MethodReferenceExample2 {

	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
	public static void main(String[] args) {
		MethodReferenceExample2 instance = new MethodReferenceExample2();
		
		Function<String, String> lambda = (str) -> instance.toUpperCase(str);
		
		Function<String, String> reference = instance :: toUpperCase;
		
		System.out.println(lambda.apply("hello"));
		System.out.println(reference.apply("world"));
	}

}
