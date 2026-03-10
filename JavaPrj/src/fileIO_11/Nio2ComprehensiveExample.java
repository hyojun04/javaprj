package fileIO_11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class Nio2ComprehensiveExample {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		
		Path baseDir = Path.of("nio2_lab");
		Path filePath = baseDir.resolve("data.txt");
		Path copyPath = baseDir.resolve("data_copy.txt");
		Path movedPath = baseDir.resolve("archive/data_moved.txt");
		
		try {
			
			//1. 디렉터리 생성
			if (Files.notExists(baseDir)) {
				Files.createDirectories(baseDir);
				System.out.println("디렉터리 생성 완료");
			}
			
			//archive 하위 디렉터리 생성
			Path archiveDir = baseDir.resolve("archive");
			if (Files.notExists(archiveDir)) {
				Files.createDirectories(archiveDir);
			}
			
			// 2.파일 생성 및 쓰기
			List<String> lines = List.of(
					"NIO.2 종합 예제입니다.",
					"현재 시간: "+ LocalDateTime.now(),
					"UTF-8 인코딩 사용 중입니다."
			);
			
			Files.write(filePath,  lines, StandardCharsets.UTF_8);
			System.out.println("파일 작성 완료");
			
			//3. 파일 읽기(Stream API)
			System.out.println("\n파일 내용 출력:");
			try(Stream<String> stream = Files.lines(filePath, StandardCharsets.UTF_8)){
				stream.forEach(System.out::println);
			}
			
			//4. 파일 복사
			Files.copy(filePath, copyPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("\n파일 복사 완료");
			
			//5. 파일 이동
			Files.move(filePath, movedPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("\n파일 이동 완료");
			
			//6. 파일 정보 출력
			System.out.println("\n파일 정보: ");
			BasicFileAttributes attrs = Files.readAttributes(movedPath, BasicFileAttributes.class);
			
			System.out.println("파일 크기: "+attrs.size()+"bytes");
			System.out.println("생성 시간: "+attrs.creationTime());
			System.out.println("수정 시간: "+attrs.lastModifiedTime());
			System.out.println("디렉터리 여부: "+attrs.isDirectory());
			
			//7. 디렉터리 탐색
			System.out.println("\n디렉터리 목록:");
			try(Stream<Path> paths = Files.walk(baseDir)){
				paths.forEach(System.out::println);
			}
			
			//8. 파일 삭제
			
			Files.deleteIfExists(movedPath);
			Files.deleteIfExists(copyPath);
			Files.deleteIfExists(archiveDir);
			Files.deleteIfExists(baseDir);
			
			System.out.println("\n정리 작업 완료");
			
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
