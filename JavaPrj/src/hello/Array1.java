package hello;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int source[] = {1,2,3,4,5,6};
		int destination[] = {9,8,7,6,5,4,3,2,1,0};
		System.arraycopy(source, 0, destination, 0, 6);
		System.out.println(Arrays.toString(destination));
	}
}
