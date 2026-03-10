package exception_8;

interface TestInterface{
	void doSomething(int n);
}
public class Test4 implements TestInterface {
	public void doSomething(int n) {
		try {
			test(n);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
	}
	
	static void test(int n) throws Exception{
		System.out.print("test");
		if(n<0) throw new Exception("n이 0보다 작음");
	}

	public static void main(String[] args) {
		try {
			new Test4().doSomething(-1);
		}catch (Exception ex) {
			System.out.println("runtime ");
		}
		System.out.print("end ");
	}

}
