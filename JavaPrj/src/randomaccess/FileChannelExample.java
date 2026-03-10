package randomaccess;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileChannelExample {

	public static void main(String[] args) {
		Path path = Path.of("channel.dat");
		
		// 파일 쓰기
		try(FileChannel channel = FileChannel.open(
				path,
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE,
				StandardOpenOption.TRUNCATE_EXISTING)){
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			buffer.putInt(200);
			buffer.putDouble(6.28);
			buffer.put("Hello NIO".getBytes());
			
			buffer.flip();
			channel.write(buffer);
			System.out.println("파일 쓰기 완료");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 읽기
		try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)){
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			channel.read(buffer);
			
			buffer.flip();
			int number = buffer.getInt();
			double value = buffer.getDouble();
			byte[] bytes = new byte[9];
			buffer.get(bytes);
			
			String text = new String(bytes);
			
			System.out.println("읽은 값:");
			System.out.println("int:"+number );
			System.out.println("double:"+value );
			System.out.println("String:"+text );
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
