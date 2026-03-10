package inheritance_7;

public class Employee extends Person{
	String department;
	
	public Employee(String name, int age, String department) {
		super(name,age);
		this.department = department;
	}
	@Override
	public String getDetails() {
		return super.getDetails() +"\t부서: "+department;
	}
}
