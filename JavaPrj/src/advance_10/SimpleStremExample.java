package advance_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStremExample {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
		
		List<String> result = strings.stream()
				.filter(s->s.length()>=3)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
