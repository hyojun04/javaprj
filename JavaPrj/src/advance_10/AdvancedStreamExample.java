package advance_10;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Alice",85),
				new Student("Bob",92),
				new Student("Charlie",78),
				new Student("Dave",88),
				new Student("Eve",95),
				new Student("Frank",68),
				new Student("Grace",92),
				new Student("Hannah",75)
		);
		
		Map<String, List<Student>> groupedByGrade = students.stream()
				.collect(Collectors.groupingBy(s-> {
					if (s.getScore() >= 90) return "A";
					else if (s.getScore() >= 80) return "B";
					else if (s.getScore() >= 70) return "C";
					else return "D";
				}));
		
		
		
		Map<String, IntSummaryStatistics> StatsByGrade = students.stream()
				.collect(Collectors.groupingBy(s-> {
					if (s.getScore() >= 90) return "A";
					else if (s.getScore() >= 80) return "B";
					else if (s.getScore() >= 70) return "C";
					else return "D";
				}, Collectors.summarizingInt(Student::getScore)));
		
		groupedByGrade.forEach((grade,studentList) -> {
			System.out.println("Grade: "+grade);
			studentList.forEach(student ->
			System.out.println("-"+student.getName()+": "+student.getScore()));
		});
		
		System.out.println("\nStatistics by Grade:");
		StatsByGrade.forEach((grade,stats) -> {
			System.out.println("Grade: "+grade);
			System.out.println("- Count: "+stats.getCount());
			System.out.println("- Sum: "+stats.getSum());
			System.out.println("- Min: "+stats.getMin());
			System.out.println("- Average: "+stats.getAverage());
			System.out.println("- Max: "+stats.getMax());
			
		});
		
		List<String> topStudents = students.stream()
				.filter(s->s.getScore()>= 90)
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println("\nTop Students:");
		topStudents.forEach(System.out::println);
	}

}
