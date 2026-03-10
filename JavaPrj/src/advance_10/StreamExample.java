package advance_10;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Alice",85),
				new Student("Bob",92),
				new Student("Charlie",78),
				new Student("Dave",88),
				new Student("Eve",95)
		);
		
		OptionalDouble averageScore = students.stream()
				.mapToInt(Student::getScore)
				.average();
		
		averageScore.ifPresent(avg -> System.out.println("Average score: "+avg));
	
		List<String> topStudents = students.stream()
				.filter(s -> s.getScore()>=90)
				.map(Student::getName)
				.collect(Collectors.toList());
		
		System.out.println("Top students: "+ topStudents);
	
	
	}

}
