package advance_10;

public class A {
	static class AInner {}
	class BInner{}
}

class B{
	void doIt() {
		A.AInner ina = new A.AInner();
		A.BInner inb = new A().new BInner(); // 객체생성필요
	}
}
