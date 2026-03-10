package hello;

import java.util.Scanner;

public class Array_Prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요: ");
		int n = sc.nextInt();
		System.out.println("과목 수를 입력하세요: ");
		int m = sc.nextInt();	
		double sum =0;
		int[][] score = new int[m][n];

		for(int i = 0 ; i<n; i++) {
			System.out.printf("학생 %d의 성적을 입력하세요: ",i+1);
			for(int j = 0 ; j<m; j++) {
				System.out.printf("\n과목 %d: ",j+1);
				score[j][i] = sc.nextInt();
			}
			System.out.println("입력된 성적: ");
		}
		for(int i = 0 ; i<n; i++) {
			System.out.printf("학생 %d: ",i+1);
			for(int j = 0 ; j<m; j++) {
				System.out.print(score[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println("각 과목의 평균 성적:");
		for(int i = 0; i<m; i++) {
			System.out.printf("과목 %d: ",i+1);
			sum = 0;
			for(int j = 0; j<n; j++) {
				sum+=score[i][j];
			}
			System.out.println(sum/(double)n);

			
		}


		sc.close();
	}
}
