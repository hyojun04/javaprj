package inheritance_7;

public class Student extends Person {
	private String major;
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() +"\t전공: "+major;
	}
	
	public void applyForClasses() {
		System.out.println("수강신청합니다.");
	}
}
