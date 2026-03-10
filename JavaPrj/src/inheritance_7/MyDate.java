package inheritance_7;

public class MyDate {
	public static void main(String[] args) {
		Date myBirth = new Date();
		myBirth.setDay(31);
		System.out.println("My birthday: "+myBirth.toString());
	}
	
}
	
class Date{
	private int day;
	private int month;
	private int year;
	
	public void setDay(int d) {
		if((d<1)||(d>31)) {
			throw new RuntimeException("잘못된 날짜 입력됨");
		} else {
			day =d;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public String toString() {
		return this.year + "-"+ this.month+"-"+this.day;
	}

}
