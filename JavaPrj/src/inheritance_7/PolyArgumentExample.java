package inheritance_7;

public class PolyArgumentExample {

	public static void main(String[] args) {
		Student s = new Student("허현수",17,"컴퓨터공학");
		printPersonInfo(s);

		Teacher t = new Teacher("허현준",12,"자바");
		printPersonInfo(t);

		Employee e = new Employee("허현정",13,"교무처");
		printPersonInfo(e);
	}

	public static void printPersonInfo(Person p) {
		if(p instanceof Student p2) { // 12버전부터
			System.out.println("Student Info");
			System.out.println(p.getDetails());
			p2.applyForClasses();
		}else if(p instanceof Teacher) {
			System.out.println("Teacher Info");
			System.out.println(p.getDetails());
		}else if(p instanceof Employee) {
			System.out.println("Employee Info");
			System.out.println(p.getDetails());
		}

	}

}
