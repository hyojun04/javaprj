package inheritance_7;

public class HeteroCollectionExample {

	public static void main(String[] args) {
		Person[] pArr = new Person[4];
		
		pArr[0] = new Person("홍길동",20);
		pArr[1] = new Student("허현수",17,"컴퓨터공학");
		pArr[2] = new Teacher("허현준",22,"자바");
		pArr[3] = new Employee("허현정",23,"교무처");
		
		for(Person p : pArr) {
			System.out.println(p.getDetails());
		}
		
		Object[] objArr = new Object[5];
		objArr[0] = new Person("홍길동",30);
		objArr[1] = new Student("허준",25,"의학");
		objArr[2] = Integer.valueOf(100);
		objArr[3] = new String("Hello");
		objArr[4] = new java.util.Date();
		for(int i =0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
	}

}
