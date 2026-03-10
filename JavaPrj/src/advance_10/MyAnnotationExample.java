package advance_10;

import java.lang.reflect.Method;


public class MyAnnotationExample {

	public static void main(String[] args) throws NoSuchMethodException{
		Method method = MyClass.class.getMethod("myMethod");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		String value = annotation.value();
		System.out.println("@MyAnnotation value: "+value);
	}

}
