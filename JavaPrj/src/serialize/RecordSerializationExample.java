package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class RecordSerializationExample {

	public static void main(String[] args) throws Exception{
		Person person = new Person("Kim", LocalDate.of(2000, 5,10));
		
		//직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))){
			oos.writeObject(person);
		}
		
		//역직렬화
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))){
			Person restored = (Person) ois.readObject();
			System.out.println("이름: "+restored.name());
			System.out.println("생년월일: "+restored.birthDate());
			System.out.println("자동 계산 나이: "+restored.age());
			
		}
	}

}
