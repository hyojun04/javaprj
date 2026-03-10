package class_6;

import java.util.Scanner;

public class Class_Prob3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX =100;
		int count = 0;
		Food[] food_arr = new Food[MAX];
		
		while(true) {
			System.out.println("입력(1) 조회(2) 수정(3) 삭제(4) 종료(0)");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:  //입력
				System.out.println("이름 수량 유통기한 설명을 입력: ");
				String n = sc.next();
				int c = sc.nextInt();
				String d = sc.next();
				String da = sc.next();
				
				Food fd = new Food(n,c,d,da);
				food_arr[count] = fd;
				count ++;
				
				break;
				
			case 2:  //조회
				for(int i =0; i<count; i++) {
					System.out.println(food_arr[i].toString());
				}
				
				break;
				
			case 3:  //수정
				System.out.println("수량을 수정하고 싶은 식자재 이름: ");
				String update_n = sc.next();
				for(int i =0; i<count; i++) {
					if(food_arr[i].name.equals(update_n)) {
						System.out.println("현재 수량: "+food_arr[i].num);
						System.out.println("수정할 수량 입력: ");
						int undate_num = sc.nextInt();
						if (undate_num != 0) {
							food_arr[i].num = undate_num;
						}else {  //수정할 수량이 0개인 경우 해당 식자재 삭제
							for(int j = i ; j<count-1; j++) {
								food_arr[j] = food_arr[j+1];
							}
							count --;
						}
						
					}else {
						if(i == count -1) {
							System.out.println("해당 이름의 식자재를 찾을 수 없음");
						}
					}
				}
				break;
				
			case 4:  //삭제
				System.out.println("삭제하고 싶은 식자재 이름: ");
				String update_d = sc.next();
				for(int i =0; i<count; i++) {
					if(food_arr[i].name.equals(update_d)) {
						for(int j = i ; j<count-1; j++) {
							food_arr[j] = food_arr[j+1];	
						}
						count --;
					}else {
						if(i == count -1) {
							System.out.println("해당 이름의 식자재를 찾을 수 없음");
						}
					}
				}
				break;
				
			case 0:  // 프로그램 종료
				sc.close();
				System.exit(0);
				break;
			
			}
		}

	}

}



class Food{
	String name;
	int num;
	String date;
	String detail;
	
	Food(String name,int num,String date, String detail){
		this.name = name;
		this.num = num;
		this.date = date;
		this.detail = detail;
	}
	
	public String toString() {
		return "이름: "+this.name +"\t수량: "+num + "\t유통기한: "+date + "\t설명: " +detail; 
	}
}