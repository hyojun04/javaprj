package hello;

import java.util.Scanner;

public class Control_Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			m = sc.nextInt();
			for(int j=0; j<m; j++) {
				sum += sc.nextInt();
			}
			System.out.printf("#%d %d",i+1,sum);
			System.out.println();
			sum = 0;
			
		}
		sc.close();
	}

}	
