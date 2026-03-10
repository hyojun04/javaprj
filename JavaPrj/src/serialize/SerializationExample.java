package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		Student student = new Student(1,"Kim", 20, "1234");
		
		// 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
			oos.writeObject(student);
			System.out.println("객체 직렬화 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
			Student restored = (Student) ois.readObject();
			System.out.println("역직렬화 결과: "+restored);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
