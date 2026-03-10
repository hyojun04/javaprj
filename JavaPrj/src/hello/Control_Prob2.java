package hello;

import java.util.Scanner;

public class Control_Prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자를 입력하세요 ");

		int n = sc.nextInt();

			switch(n) {
			case 1:
				System.out.println("정사각형");
				break;
			case 2:
				System.out.println("직사각형");
				break;
			case 3:
				System.out.println("삼각형");
				break;
			default:
				System.out.println("1~3 사이의 숫자를 입력하세요");	
		}
		sc.close();
	}

}
