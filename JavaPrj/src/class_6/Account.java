package class_6;

public class Account {
	//변수 선언
	public String name;
	public String accountNumber;
	public String passwd;
	public long balance;
	public float interest;
	
	//메서드 선언
	public void saveMoney(long amount) {
		balance = balance + amount;
	}
	
	public void withdrawMoney(long amount) {
		balance = balance - amount;
	}
	public long getBalance() {
		return balance;
	}
}
