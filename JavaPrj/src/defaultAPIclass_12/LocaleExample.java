package defaultAPIclass_12;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {
	static public void localizedFormat(String pattern, double value, Locale loc) {
		NumberFormat nf = NumberFormat.getNumberInstance(loc);
		DecimalFormat df = (DecimalFormat)nf;
		df.applyPattern(pattern);
		String output = df.format(value);
		System.out.println(pattern + " "+output + " "+ loc.toString());
		
	}
	public static void main(String[] args) {
		Locale locale = new Locale("ko", "KR");
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		
		Locale locale2 = new Locale("en", "US");
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		
		System.out.println();
		Locale[] locales = {
				new Locale("en", "US"),
				new Locale("de", "DE"),
				new Locale("fr", "FR"),
				new Locale("ko", "KR"),
		};
		
		for (int i =0; i< locales.length; i++) {
			localizedFormat("###,###.###", 123456.789, locales[i]);
		}
	}

}
