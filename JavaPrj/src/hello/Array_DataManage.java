package hello;

import java.util.Scanner;

public class Array_DataManage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[100];
		int index = -1;
		int count = 0;
		int num = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.println("추가: 1, 출력: 2, 조회: 3, 수정: 4, 삭제: 5, 삽입: 6, 종료: 7");
			num = sc.nextInt();
			switch(num) {
			case 1:  // 추가
				System.out.print("추가를 원하는 값 입력: ");
				int n = sc.nextInt();
				data[count] = n; 
				count ++;
				break;
			case 2:  // 출력
				for(int i =0; i < count; i++) {
					System.out.print(data[i]+ " ");
				}
				System.out.println();
				break;
			case 3:  // 조회
				System.out.print("조회를 원하는 값 입력: ");
				int searchData  = sc.nextInt();
				for(int i =0; i<count; i++) {
					if(data[i] == searchData) {
						System.out.println(i+"위치에서 데이터 찾음");
						break;
					}else {
						if (i==count-1) {
							System.out.println("해당 값이 없음");
						}
					}
				}
				break;
			case 4:  // 수정
				System.out.print("수정할 인덱스와 값 입력: ");
				index = sc.nextInt();
				int b  = sc.nextInt();
				data[index] = b;
				break;
			case 5:  // 삭제
				if(count>0) {
					System.out.print("삭제를 원하는 인덱스 입력: ");
					index = sc.nextInt();
					for(int i = index; i<count-1; i++) {
						data[i] = data[i+1];
					}
					count--;
				}else {
					System.out.println("데이터가 0개라 삭제 불가");
				}
				break;
				
			case 6:  // 삽입
				System.out.print("삽입할 인덱스와 값 입력: ");
				index = sc.nextInt();
				int c  = sc.nextInt();
				for(int i = count; i>index; i--) {
					data[i] = data[i-1];
				}
				data[index] = c;
				count++;
				break;
			case 7:  //종료
				flag = false;
				break;
			}
			
		}
		sc.close();
	}

}
