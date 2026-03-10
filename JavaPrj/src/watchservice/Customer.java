package watchservice;

import java.io.Serializable;

public record Customer(
		String name,
		char gender,
		String email,
		int birthYear
		) implements Serializable{
	public String toCSV() {
		return "%s,%s,%s,%d".formatted(name,gender,email,birthYear);
	}
	
	public static Customer fromCSV(String line) {
		String[] values = line.split(",");
		return new Customer(
				values[0],
				values[1].charAt(0),
				values[2],
				Integer.parseInt(values[3])
				);
	}
	
	public int age() {
		return java.time.Year.now().getValue() - birthYear;
	}
}
