package advance_10;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExample {

	public static void main(String[] args) {
		String[] names = {"Eric", "Jin", "Barrrr", "Fo"};
		
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// 기존 방식
		System.out.println("\n--------------------------\n");
		Arrays.sort(names, new StringComparator());
		
		for (String name : names) {
			System.out.println(name);
		}
		
		//람다 표현식
		System.out.println("\n--------------------------\n");
		Arrays.sort(names, (a,b) -> a.length() - b.length());
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}

class StringComparator implements Comparator<String>{
	@Override
	public int compare(String a, String b) {
		return a.length() - b.length();
	}
}
