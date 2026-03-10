package defaultAPIclass_12;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date after = new Date();
		System.out.println(after.getTime());
	}

}
