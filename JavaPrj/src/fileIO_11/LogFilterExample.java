package fileIO_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class LogFilterExample {

	public static void main(String[] args) {
		Path source = Path.of("server.log");
		Path target = Path.of("error.log");
		
		try (
				BufferedReader reader = Files.newBufferedReader(source,StandardCharsets.UTF_8);
				BufferedWriter writer = Files.newBufferedWriter(target,StandardCharsets.UTF_8);
				){
			String line;
			while((line = reader.readLine()) != null) {
				if(line.contains("ERROR")) {
					writer.write(line);
					writer.newLine();
				}
			}
			
			System.out.println("ERROR 로그 추출 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
