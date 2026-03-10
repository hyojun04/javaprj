package serialize;

import java.io.Serializable;
import java.time.LocalDate;

public record Person(
		String name,
		LocalDate birthDate
		)implements Serializable {
	
	public int age() {
		return LocalDate.now().getYear() - birthDate.getYear();	}
	

}
