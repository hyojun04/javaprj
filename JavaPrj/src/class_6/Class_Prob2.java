package class_6;

public class Class_Prob2 {
	public static int calculateSum(int... values) {
		int sum = 0;
		for(int value:values) {
			sum+=value;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum1 = calculateSum(1,2,3,4,5);
		int sum2 = calculateSum(10,20,30);
		int sum3 = calculateSum(8,2,5,7);
		
		System.out.println("첫 번째 합계: "+ sum1);
		System.out.println("두 번째 합계: "+ sum2);
		System.out.println("세 번째 합계: "+ sum3);
		
		
	}

}
