package randomaccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
			
			// 데이터 쓰기
			raf.writeInt(100);
			raf.writeDouble(3.14);
			raf.writeUTF("Hello Java");
			System.out.println("파일 길이: "+raf.length());
			
			// 파일 처음으로 이동
			raf.seek(0);
			
			// 데이터 읽기
			int number = raf.readInt();
			double pi = raf.readDouble();
			String text = raf.readUTF();
			
			System.out.println("읽은 값:");
			System.out.println("int: "+number);
			System.out.println("double: "+pi);
			System.out.println("String: "+text);
			
			// 중간 위치 수정 (double 위치)
			raf.seek(4); // int(4byte) 다음 위치
			raf.writeDouble(9.99);
			
			raf.seek(4);
			System.out.println("수정된 double: "+raf.readDouble());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
