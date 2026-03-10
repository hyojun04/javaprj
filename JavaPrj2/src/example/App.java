package example;

import calculator.Calculator;

public class App {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 7);
		System.out.println("Result: " + result);
	}

}
