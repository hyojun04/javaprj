package defaultAPIclass_12;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatExample {
	
	static public void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value +"\t" + pattern +"\t" + output);
	}

	public static void main(String[] args) {
		customFormat("###,###.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 12345.67);
		customFormat("#.##%", 123.456789);
		customFormat("#.###\u2030", 123.456789);
		customFormat("$###,###.###", 12345.67);
		customFormat("\u00a4###,###.###", 12345.67);
		customFormat("\u00a5###,###.###", 12345.67);
		customFormat("\u00a3###,###.###", 12345.67);
		customFormat("\u00a9###,###.###", 12345.67);
		
		DecimalFormat deFormatter = (DecimalFormat)NumberFormat.getNumberInstance(new Locale("de","DE"));
		deFormatter.applyPattern("###,###.###");
		String output = deFormatter.format(123.450);
		System.out.println("123.450 \t###,###.### \t"+output);

	}

}
