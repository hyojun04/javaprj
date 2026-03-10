package advance_10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation1{
	String value();
}

public class SourceRetentionExample {
	@MyAnnotation1(value = "This annotation will be retained only in source code")
	public void myMethod() {
		
	}
}
