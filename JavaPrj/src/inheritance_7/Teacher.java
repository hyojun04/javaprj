package inheritance_7;

public class Teacher extends Person{
	String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	@Override
	public String getDetails() {
		return super.getDetails() +"\t과목: "+subject;
	}
}
