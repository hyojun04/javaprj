package defaultAPIclass_12;

import java.util.HashSet;

public class PencaseExample {

	public static void main(String[] args) {
		Pen p1 = new Pen("p0001", "빨간색");
		Pen p2 = new Pen("p0001", "빨간색");
		
		HashSet<Pen> pens = new HashSet<Pen>();
		System.out.println(pens.add(p1));
		System.out.println(pens.add(p2)); // HashSet은 동일객체 저장 안 함
		for(Pen pen : pens) {
			System.out.println(pen);
		}
	}

}
