package defaultAPIclass_12;

public class RegExpExample {

	public static void main(String[] args) {
		String data = "홍길동,서울,010-1234-5678,30,M";
		String maskedData = data.replaceAll("\\d{3}-\\d{4}-\\d{4}","***-****-****");
		System.out.println(maskedData);
	}

}
