package record;
//DTO(Data Transfer Object), VO(Value Object)
public class Employee {
	//사원번호, 이름, 급여
	private int empId;
	private String name;
	private double salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//우클릭 source에서 자동 생성 가능
	
}
