package watchservice;

import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;


public class FileWatcherExample {

	public static void main(String[] args) {
		Path dir = Path.of("watch_dir");
		
		try {
			// 디렉터리 생성 (없으면)
			if(Files.notExists(dir)) {
				Files.createDirectories(dir);
			}
			WatchService watchService = FileSystems.getDefault().newWatchService();
			
			// 디렉터리 등록
			dir.register(
					watchService,
					ENTRY_CREATE,
					ENTRY_DELETE,
					ENTRY_MODIFY
			);
			
			System.out.println("파일 감지 시작: " + dir.toAbsolutePath());
			
			while (true) {
				WatchKey key = watchService.take();
				
				for (WatchEvent<?> event : key.pollEvents()) {
					WatchEvent.Kind<?> kind = event.kind();
					
					//OVERFLOW 처리
					if (kind == OVERFLOW) {
						continue;
					}
					
					Path changed = (Path) event.context();
					
					System.out.println("이벤트 종류: "+kind.name());
					System.out.println("파일 이름: "+ changed);
					System.out.println("-------------------");
				}
				
				boolean valid = key.reset();
				if (!valid) {
					break;
				}
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
