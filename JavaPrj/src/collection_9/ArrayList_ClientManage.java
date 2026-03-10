package collection_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_ClientManage {

	static Scanner sc = new Scanner(System.in);
	static List<String> name = new ArrayList<String>();
	static List<Character> gender = new ArrayList<Character>();
	static List<String> email = new ArrayList<String>();
	static List<Integer> year = new ArrayList<Integer>();
		
	static int index = -1;
	static int count = 0;
	static boolean flag = true;
	
	public static void printCustomer() {
		if (count != 0) {
			System.out.println("이름: "+name.get(index));
			System.out.println("성별: "+gender.get(index));
			System.out.println("이메일: "+email.get(index));
			System.out.println("출생 연도: "+year.get(index));	
		}else {
			System.out.println("등록된 고객이 없음");
		}
		
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
				
				name.add(n);
				gender.add(g);
				email.add(e);
				year.add(y);
				
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
				//System.out.printf("%d 번째 고객 정보 출력",index);
				printCustomer();
				break;
			case 'u': // 현재 인덱스의 고객 정보 수정
				System.out.println("고객 정보 입력(이름 성별 이메일 출생연도): ");
				String nu = sc.next();
				char gu = sc.next().charAt(0);
				String eu = sc.next();
				int yu = sc.nextInt();
				
				name.set(index, nu);
				gender.set(index, gu);
				email.set(index, eu);
				year.set(index, yu);
				
				break;
			case 'd': // 현재 인덱스의 고객 정보 삭제
				for(int i = index; i<count-1; i++) {
					name.set(i, name.get(i+1));
					gender.set(i, gender.get(i+1));
					email.set(i, email.get(i+1));
					year.set(i, year.get(i+1));
				}
				count--;
				if (count ==0) {
					index = -1; // 초기상태로
				}else {
					index = count -1; // 마지막 고객 가르키기
				}
				break;
			case 'q': // 프로그램 종료
				flag = false;
				break;
			
			}
			
			
			
		}

	}

}