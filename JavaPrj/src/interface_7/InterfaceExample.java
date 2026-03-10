package interface_7;

public class InterfaceExample {

	public static void main(String[] args) {
		/*System.out.println(ISomething.MY_INT);
		System.out.println(Something.MY_INT);
		Something some1 = new Something();
		some1.run();
		some1.doIt();
		ISomething.doThat();
		*/
		
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo;
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
		//itodo3.m4();
		IToDo4 itodo4 = todo;
		itodo4.m4();
	}

}
