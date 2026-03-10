package record;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"hy",100000);
		Employee2 e2 = new Employee2(2,"he",110000);
		Employee3 e3 = new Employee3(3,"ho",120000);
		
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		System.out.println(e3.empId());
		System.out.println(e3.isManager());
	}

}
