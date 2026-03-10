package watchservice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {

	private static final Path FILE_PATH = Path.of("customer.csv");
	private static final List<Customer> custList = new ArrayList<>();
	private static int index = -1;
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		loadCustomer();

		while(true){
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d%n",custList.size(),index);

			System.out.println("""
					메뉴를 입력하세요.
					(I)nsert, (P)revious, (N)ext, (C)urrent,
					(U)pdate, (D)elete, (S)ave, (Q)uit
					> """);
			String menu = scanner.next().toLowerCase();

			switch(menu.charAt(0)) {
			case 'i' -> insertCustomer();
			case 'p' -> movePrevious();
			case 'n' -> moveNext();
			case 'c' -> printCustomer();
			case 'u' -> updateCustomer();
			case 'd' -> deleteCustomer();
			case 's' -> saveCustomer();
			case 'q' -> {
				System.out.println("프로그램 종료");
				return;
			}
			default -> System.out.println("잘못된 메뉴 입력");
			}
		}

	}
	
	private static void loadCustomer() {
		if (Files.notExists(FILE_PATH)) return;
		
		try {
			custList.addAll(
					Files.readAllLines(FILE_PATH)
					.stream()
					.map(Customer::fromCSV)
					.toList()
			);
			System.out.println("파일에서 데이터 로드 완료");
		} catch (IOException e) {
			System.out.println("파일 로드 실패: "+e.getMessage());
		}
	}
	
	private static void saveCustomer() {
		try {
			Files.write(
					FILE_PATH, 
					custList.stream()
						.map(Customer::toCSV)
						.toList()
			);
			System.out.println("파일 저장 완료");
		} catch (IOException e) {
			System.out.println("파일 저장 실패: "+e.getMessage());
		}
	}
	
	private static void insertCustomer() {
		System.out.println("이름: ");
		String name = scanner.next();
		
		System.out.println("성별(M/F): ");
		char gender = scanner.next().charAt(0);
		
		System.out.println("이메일: ");
		String email = scanner.next();
		
		System.out.println("출생년도: ");
		int birthYear = scanner.nextInt();
		
		custList.add(new Customer(name, gender, email, birthYear));
		index = custList.size() -1;

	}
	
	private static void printCustomer() {
		if (index <0 || index >= custList.size()) {
			System.out.println("선택된 데이터 없음");
			return;
		}
		
		Customer c = custList.get(index);
		
		System.out.println("""
				===== CUSTOMER INFO =====
				이름: %s
				성별: %s
				이메일: %s
				출생년도: %d
				나이: %d
				=========================
				""".formatted(c.name(),c.gender(),c.email(),c.birthYear(),c.age()));
	}
	
	private static void deleteCustomer() {
		if (index >= 0 && index < custList.size()) {
			custList.remove(index);
			index = custList.isEmpty() ? -1 : 0;
 		}
	}
	
	private static void updateCustomer() {
		if(index<0 || index >= custList.size()) {
			System.out.println("선택된 데이터 없음");
			return;
		}
	
	
	Customer old = custList.get(index);
	
	System.out.print("이름("+old.name()+"): ");
	String name = scanner.next();
	
	System.out.print("성별("+old.gender()+"): ");
	char gender = scanner.next().charAt(0);
	
	System.out.print("이메일("+old.email()+"): ");
	String email = scanner.next();
	
	System.out.print("출생년도("+old.birthYear()+"): ");
	int birthYear = scanner.nextInt();
	
	custList.set(index, new Customer(name,gender,email,birthYear));
	
	
	}
	
	private static void movePrevious() {
		if (index > 0 ) index--;
		printCustomer();
	}
	
	private static void moveNext() {
		if (index < custList.size() ) index++;
		printCustomer();
	}

}
