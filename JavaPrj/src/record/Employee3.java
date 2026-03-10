package record;


public record Employee3(
	int empId,
	String name,
	double salary
	)
{
	public Employee3{  // compact constructor
		if(empId <=0) {
			throw new RuntimeException("사원 id는 0이상이어야 함");
		}
	}
	
	public boolean isManager() {
		return empId == 100;
	}
}
