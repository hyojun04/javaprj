package serialize;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = -913130089586197251L;
	
	private int id;
	private String name;
	private int age;
	
	
	private transient String password;
	
	public Student(int id, String name, int age, String paaword) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.password = password;
		
	}
	
	@Override
	public String toString() {
		return "Student{id=%d, name='%s', age=%d, password='%s'}"
				.formatted(id,name,age,password);
	}

}
