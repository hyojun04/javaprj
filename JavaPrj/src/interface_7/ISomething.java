package interface_7;

public interface ISomething {
	public static final int DEFAULT_SALARY = 10000;
	int MY_INT = 22;  // 자동으로 public static final 이 된다.
	void run();  // 자동으로 public abstract 가 된다.
	
	default void doIt() {  // 이 interface를 구현한 클래스에서 구현할 필요 없는 메서드
		System.out.println("default method");
		dob();
	}
	
	private void dob() {
		System.out.println("private instance method");
	};
	
	static void doThat() {
		System.out.println("static method");
		doa();
	}
	
	private static void doa() {
		System.out.println("private static");
	}
}
