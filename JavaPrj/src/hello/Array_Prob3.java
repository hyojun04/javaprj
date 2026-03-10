package hello;

import java.util.Scanner;

public class Array_Prob3 {
	static final int MAX = 100;
	static String[] name = new String[MAX]; 
	static int[] count = new int[MAX]; 
	static String[] date = new String[MAX]; 
	static String[] detail = new String[MAX]; 
	static boolean flag = true;
	static Scanner sc = new Scanner(System.in);
	static int cnt = 0;
	static int index = -1;
	
	private static void deleteFood() {
		System.out.println("삭제할 음식: ");
		String food = sc.next();
		for(int i = 0 ; i<cnt; i++) {
			if(name[i].equals(food)) {
				for(int j=i; j<cnt-1; j++) {
					name[j] = name[j+1];
					count[j] = count[j+1];
					date[j] = date[j+1];
					detail[j] = detail[j+1];
				}
			}
		}
		cnt--;
	}
	public static void main(String[] args) {
		
		
		
		while(flag) {
			System.out.println("메뉴: 입력(1) 조회(2) 수정(3) 삭제(4) 종료(0)");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:  // 식자재 정보 입력
				System.out.println("식자재 정보 입력(이름 수량 유통기한 설명): ");
				String n = sc.next();
				int c = sc.nextInt();
				String d = sc.next();
				String de = sc.next();
				
				name[cnt] = n;
				count[cnt] = c;
				date[cnt] = d;
				detail[cnt] = de;
				
				cnt ++;
				break;
			case 2:  // 식자재 정보 조회
				for(int i = 0; i<cnt; i++) {
					System.out.printf("이름: %s, 수량: %d, 유통기한: %s, 설명: %s \n",name[i],count[i],date[i],detail[i]);
				}
				break;
			case 3:  // 식자재 수량 수정
				System.out.println("수량을 수정할 식자재 이름: ");
				String update = sc.next();
				for (int i = 0; i<cnt; i++) {
					if (name[i].equals(update)) {
						System.out.println("수정할 수량: ");
						int update_count = sc.nextInt();
						if(update_count != 0) {
							count[i] = update_count;
						}
						else {  // 수량을 0으로 수정할 경우 해당 식자재를 삭제
							for(int j=i; j<cnt-1; j++) {
								name[j] = name[j+1];
								count[j] = count[j+1];
								date[j] = date[j+1];
								detail[j] = detail[j+1];
							}
							cnt --;
						}
						
					}
				}
				break;
			case 4:  // 식자재 정보 삭제
				deleteFood();
				break;
			case 0:   // 종료
				flag = false;
				break;
			}
		}
		sc.close();
	}

}
