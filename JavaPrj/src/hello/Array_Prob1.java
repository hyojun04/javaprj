package hello;

import java.util.Scanner;

public class Array_Prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요: ");
		int n = sc.nextInt();
		double sum =0;
		int[] arr = new int[n];
		for(int i = 0 ; i<n; i++) {
			System.out.printf("학생 %d의 성적을 입력하세요: ",i+1);
			arr[i] = sc.nextInt();
		}
		System.out.println("입력된 성적: ");
		for(int i = 0 ; i<n; i++) {
			System.out.printf("학생 %d: %d \n",i+1, arr[i]);
			sum+=arr[i];
		}
		System.out.println("평균 성적: " + sum/(double)n);
		
		sc.close();
	}

}
