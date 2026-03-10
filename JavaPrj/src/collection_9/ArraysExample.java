package collection_9;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		String[] fruitsArray = {"apple", "banana", "orange"};
		System.out.println("Array to List: "+ Arrays.asList(fruitsArray));
		
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,3,4};
		int result = Arrays.compare(array1, array2);
		if (result < 0 ) {
			System.out.println("Array 1 is smaller than Array 2");
		} else if (result > 0) {
			System.out.println("Array 1 is larger than Array 2");
		} else { 
			System.out.println("Both arrays are equal");
		}
		
		int[] numbers = {5,2,9,1,3};
		Arrays.sort(numbers);
		System.out.println("Sorted Array: "+Arrays.toString(numbers));
	}

}
