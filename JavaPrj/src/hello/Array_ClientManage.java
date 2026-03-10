package hello;

import java.util.Scanner;

public class Array_ClientManage {
	
	static Scanner sc = new Scanner(System.in);
	static String[] name = new String[100];
	static char[] gender = new char[100];
	static String[] email = new String[100];
	static int[] year = new int[100];
	
	static int index = -1;
	static int count = 0;
	static boolean flag = true;
	
	public static void printCustomer() {
		System.out.println("이름: "+name[index]);
		System.out.println("성별: "+gender[index]);
		System.out.println("이메일: "+email[index]);
		System.out.println("출생 연도: "+year[index]);
	}

	public static void main(String[] args) {
		
		while(flag) {
			System.out.println("프로그램 메뉴: insert, previous, next, current, update, delete, quit");
			String menu = sc.next();
			switch(menu.charAt(0)) {
			case 'i': // 고객 정보 입력
				System.out.println("고객 정보 입력(이름 성별 이메일 출생연도): ");
				String n = sc.next();
				char g = sc.next().charAt(0);
				String e = sc.next();
				int y = sc.nextInt();
				
				name[count] = n;
				gender[count] = g;
				email[count] = e;
				year[count] = y;
				
				count++;
				index++;
				
				break;
			case 'p': // 이전 고객 정보 조회
				if(index>0) {
					index --;
					System.out.printf("%d 번째 고객 정보 출력",index);
					printCustomer();
				}else {
					System.out.println("이전 고객이 없음");
				}
				break;
			case 'n': // 다음 고객 정보 조회
				if(index<count-1) {
					index ++;
					System.out.printf("%d 번째 고객 정보 출력",index);
					printCustomer();
				}else {
					System.out.println("다음 고객이 없음");
				}
				break;
			case 'c': // 현재 인덱스의 고객 정보 조회
				System.out.printf("%d 번째 고객 정보 출력",index);
				printCustomer();
				break;
			case 'u': // 현재 인덱스의 고객 정보 수정
				System.out.println("고객 정보 입력(이름 성별 이메일 출생연도): ");
				String nu = sc.next();
				char gu = sc.next().charAt(0);
				String eu = sc.next();
				int yu = sc.nextInt();
				
				name[index] = nu;
				gender[index] = gu;
				email[index] = eu;
				year[index] = yu;
				
				break;
			case 'd': // 현재 인덱스의 고객 정보 삭제
				for(int i = index; i<count-1; i++) {
					name[i] = name[i+1];
					gender[i] = gender[i+1];
					email[i] = email[i+1];
					year[i] = year[i+1];
				}
				count--;
				break;
			case 'q': // 프로그램 종료
				flag = false;
				break;
			
			}
			
			
			
		}

	}

}
