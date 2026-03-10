package class_6;

public class Calculator {
	
	public Calculator() {
		System.out.println("hi");
	}
	
	public int sum(int... values) {
		int sum = 0;
		for(int value:values) {
			sum += value;
		}
		return sum;
	}
}
