package inheritance_7;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		this(name,1);
	}
	public Person(int age) {
		this("Unknown",age);
	}
	public Person() {
		this("Unknown",1);
	}
	
	public String getDetails() {
		return "이름: " + name+ "\t나이: " + age;
	}
}
