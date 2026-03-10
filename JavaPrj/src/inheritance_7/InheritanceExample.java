package inheritance_7;

public class InheritanceExample {
	public static void main(String[] args) {
		Person p;
		p = new Person("홍길동",25);
		System.out.println(p.getDetails());
		
		p = new Student("이순신",30,"컴퓨터공학");
		System.out.println(p.getDetails());
		
		p = new Teacher("강감찬",40,"자바프로그래밍");
		System.out.println(p.getDetails());
		
		p = new Employee("최경주",30,"교무처");
		System.out.println(p.getDetails());
		
		
	}
}
