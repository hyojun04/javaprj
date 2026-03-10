package collection_9;

import java.util.HashSet;
import java.util.Set;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		Dog d1 = new Dog("1234567890", "바둑이");
		Dog d2 = new Dog("1234567890","바둑이");
		
		System.out.println(d1.equals(d2));
		System.out.println(d1 == d2);
		System.out.println(d1);
		
		Set<Dog> set = new HashSet<Dog>();
		System.err.println("d1 객체를 set에 저장 : "+ set.add(d1));
		System.out.println("d2 객체를 set에 저장 : "+ set.add(d2));
	}

}
