package fileIO_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class CsvReaderExample {

	
		public static List<Student> readStudents(Path path) throws IOException{
			try(var lines = Files.lines(path)){
				return lines
						.skip(1)
						.map(line -> line.split(","))
						.map(fields -> new Student(
								Integer.parseInt(fields[0]),
								fields[1],
								Integer.parseInt(fields[2]),
								Integer.parseInt(fields[3])
						
								))
								.collect(Collectors.toList());
			}
			
		}
		
		public static void main(String[] args) throws IOException {
			Path path = Path.of("students.csv");
			List<Student> students = readStudents(path);
			students.forEach(System.out::println);
	}

}
