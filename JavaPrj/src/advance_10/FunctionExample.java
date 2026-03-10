package advance_10;

import java.util.Arrays;
import java.util.List;

import class_6.Book;

public class FunctionExample {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10,15,23,16,83,14,21,12);
		MyUtil<Integer> util = new MyUtil<>();
		List<Integer> filteredOutput = util.filter(intList, (data) -> data%2 == 0);
		System.out.println(filteredOutput);
		
		
		List<String> strList = Arrays.asList("Hello","JinDyoung","Nice","World", "JK");
		MyUtil<String> util2 = new MyUtil<>();
		List<String> filteredoutput2 = util2.filter(strList, (data) -> data.length()>=5);
		System.out.println(filteredoutput2);
	
	}

}
