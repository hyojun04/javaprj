package advance_10;

import java.util.function.Supplier;

public class MethodReferenceExample3 {
	public MethodReferenceExample3() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		Supplier<MethodReferenceExample3> lambda = () -> new MethodReferenceExample3();	
		
		Supplier<MethodReferenceExample3> reference = MethodReferenceExample3 :: new;
	
		
		lambda.get();
		reference.get();
	
	}

}
