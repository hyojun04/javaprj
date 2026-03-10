package hello;

import java.util.Scanner;

//import java.util.Date;  // ctrl + shift + o 를 통해 필요한 import 문 정리
//public class는 파일에 하나만 둘 수 있음, 다른 class들을 파일에 추가할 수 있지만 유지 보수 비효율적
/**
 *  샘플 Hello World 클래스
 *  @author 정효준
 *  @since 2026-02-23
 */
public class HelloWorld {  
	//필드(멤버변수): 정보를 저장, 속성
	// 타입으로는 8개의 기본 타입 + 2개의 객체 참조(Reference: 배열, 클래스) 총 10가지 사용 가능
	int num = 2;  // 파란색은 멤버변수라는 뜻

	//Initializer
	//생성자: 필드를 초기화

	//메서드: 행위를 실행
	//접근제한자 리턴타입 이름(매개변수 들){}
	// byte,short,int,long,float,double,char,boolean,[],클래스,void
	int calc(int num) { // 연한 갈색은 지역변수, 매개변수는 메서드 안에서만 지역적으로 사용됨
		int result = num*this.num; // this.num 은 매개변수가 아닌 멤버변수를 가리킴
		return result; // 반환 타입이 void가 아닌 경우 리턴이 있어야 함
	} //속성은 행위 결과에 영향을 준다

	//내부 클래스(주로 사용 안 함)
	public static void main(String[] args) throws Exception{  // 대문자로 시작하는 것은 이미 정의된 class 임
		//System.out.println("Hello World");
		//HelloWorld a = new HelloWorld(); // 클래스명 객체변수명 = new 생성자()
		//System.out.println(a.calc(5)); // 객체변수명.멤버
		//Date d = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("주사위 번호를 입력하세요: ");
		int diceNumber = scanner.nextInt();
		System.out.println("주사위 번호: "+diceNumber);
		System.out.println(diceNumber % 2 == 0 ? "주사위 숫자 " + diceNumber +"는 짝수!" : "주사위 숫자 " + diceNumber +"는 홀수!");
		
		
		scanner.close();
		}		
	
}

// 보라색 문자(package, import ..)는 예약어, HelloWorld, d .. 등은 식별자