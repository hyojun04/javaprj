package class_6;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {

	public static void main(String[] args) {
		var myList = new ArrayList<String>();
		System.out.println(myList.size());
		
		var str = "Hello";
		var x = 10;
		x = 20;
		
		System.out.println(str + " " + x);
		
		List<String> myList2 = new ArrayList<>();
		System.out.println(myList2);
		
		MyFunction myfunc = (s) -> s.length();
		System.out.println(myfunc.myMethod("Hello"));
	}

}

interface MyFunction{
	int myMethod(String s);
}
