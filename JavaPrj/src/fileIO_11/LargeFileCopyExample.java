package fileIO_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LargeFileCopyExample {

	public static void main(String[] args) {
		Path source = Path.of("video.mp4");
		Path target = Path.of("video_backup.mp4");
		
		try (
				BufferedInputStream in = new BufferedInputStream(Files.newInputStream(source));
				BufferedOutputStream out = new BufferedOutputStream(Files.newOutputStream(target));
				){
			byte[] buffer = new byte[8192];
			int bytesRead;
			
			while((bytesRead = in.read(buffer)) != -1) {
				out.write(buffer,0,bytesRead);
			}
			System.out.println("파일 복사 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
