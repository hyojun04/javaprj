package defaultAPIclass_12;

public class StringEqulsExample {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String ("Hello");
		String s4 = new String ("Hello");
		// 객체 주소 비교
		System.out.println("s1 == s2: "+ (s1==s2)); 
		System.out.println("s1 == s3: "+ (s1==s3));
		System.out.println("s3 == s4: "+ (s3==s4));
		// 객체 동등 비교
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s3.equals(s4) : "+s3.equals(s4));
	}

}
