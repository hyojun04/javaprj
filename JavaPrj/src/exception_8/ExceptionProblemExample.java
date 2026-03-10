package exception_8;

import java.util.Scanner;

public class ExceptionProblemExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] greetings = {"안녕하세요.","반갑습니다.","또 오세요"};
		while(true) {
			try {
				System.out.printf("0 이상 %d 미만의 정수를 입력하세요(99는 종료):", greetings.length);
				if(scanner.hasNextInt()) {
					int index = scanner.nextInt();
					if(index==99) {
						System.out.println("반복을 종료합니다.");
						break;
					}
					System.out.println(greetings[index]);
				}else {
					System.out.println("정수를 입력하세요.");
					scanner.next();
				}
			}catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}finally {
				System.out.println("항상 실행됩니다.");
			}
		}
		System.out.println("메인의 마지막입니다.");
		scanner.close();
	}

}
