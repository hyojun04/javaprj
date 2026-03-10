package defaultAPIclass_12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println((calendar.get(Calendar.ZONE_OFFSET) - calendar.get(Calendar.DST_OFFSET)) / (60*1000));
	
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz);
		System.out.println("Timezone offset: "+ tz.getID());
		System.out.println("Timezone name: "+ tz.getDisplayName());
		System.out.println("Timezone ID: "+ (tz.getRawOffset()/1000/60));
		
		Date date = new Date();
		System.out.println(date);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)");
		System.out.format("%s%n%s%n%n", tz.getDisplayName(),df.format(date));
		
		TimeZone tz2 = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(tz2);
		System.out.format("%s%n%s%n%n", tz2.getDisplayName(),df.format(date));
		
		TimeZone tz3 = TimeZone.getTimeZone("America/Los_Angeles");
		df.setTimeZone(tz3);
		System.out.format("%s%n%s%n%n", tz3.getDisplayName(),df.format(date));
		
	}

}
