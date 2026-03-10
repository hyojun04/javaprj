package fileIO_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvStreamExample {

	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("students.csv");
		
		// 샘플 CSV 파일 생성 (Text Block 사용)
		createSampleCsv(path);
		
		// CSV 읽기
		List<Student> students = readStudents(path);
		
		
		System.out.println("===== 전체 학생 목록 =====");
		students.forEach(System.out::println);
		
		// 평균 점수 계산
		double average = students.stream()
				.mapToInt(Student::score)
				.average()
				.orElse(0.0);
		
		System.out.println("\n평균 점수: "+average);
		
		// 90점 이상 학생
		System.out.println("\n===== 90점 이상 =====");
		students.stream()
				.filter(s->s.score()>= 90)
				.forEach(System.out::println);
		
		// 최고 점수 학생
		students.stream()
			.max(Comparator.comparingInt(Student::score))
			.ifPresent(s -> System.out.println("\n최고 점수 학생: "+s));
		
		// 점수 내림차순 정렬
		System.out.println("\n===== 점수 내림차순 정렬 =====");
		students.stream()
				.sorted(Comparator.comparingInt(Student::score).reversed())
				.forEach(System.out::println);
		
		// 나이별 그룹화
		System.out.println("\n===== 나이별 그룹화 =====");
		Map<Integer, List<Student>> grouped = students.stream()
		.collect(Collectors.groupingBy(Student::age));
		
		grouped.forEach((age,list) -> {
			System.out.println("Age: "+age);
			list.forEach(System.out::println);
		});
		
		// 상위 3명 추출
		System.out.println("\n===== 상위 3명 =====");
		students.stream()
		.sorted(Comparator.comparingInt(Student::score).reversed())
		.limit(3)
		.forEach(System.out::println);
		
		writeStudents(Path.of("students_output.csv"), students);

	}
	
	
	private static void createSampleCsv(Path path) throws IOException{
		
		String sampleCsv = """
				id,name,age,score
				1,Kim,20,88
				2,Lee,22,92
				3,Park,19,76
				4,Choi,21,95
				5,Jung,22,89d
				""";
		Files.writeString(path, sampleCsv,StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		
	}
	
	public static List<Student> readStudents(Path path) throws IOException{
		try (Stream<String> lines = Files.lines(path)){
			return lines
					.skip(1)
					.map(CsvStreamExample::parseStudent)
					.flatMap(Optional::stream)
					.toList();
		}
	}
	
	//안전한 파싱
	private static Optional <Student> parseStudent(String line){
		try {
			String[] f = line.split(",");
			return Optional.of(new Student(
					Integer.parseInt(f[0]),
					f[1],
					Integer.parseInt(f[2]),
					Integer.parseInt(f[3])
			));
		} catch (Exception e) {
			return Optional.empty();
		}
	}
	
	//CSV 쓰기
	public static void writeStudents(Path path, List<Student> students) throws IOException{
		List <String> lines = students.stream()
				.map(s -> "%d, %s,%d,%d".formatted(
						s.id(),
						s.name(),
						s.age(),
						s.score()))
				.toList();
		Files.write(path,
				lines,
				StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);
		System.out.println("\nstudents_output.csv 파일 저장 완료");
	}
}
