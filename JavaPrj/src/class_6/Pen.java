package class_6;

public class Pen {
	String color = "black"; //멤버변수
	int price = 500;				//멤버변수
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		System.out.printf("color: %s, price: %d 로 초기화\n",this.color,this.price);
	}
	public void write(int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(this.color +"색으로 글을 씁니다.");
		}
		System.out.println("가격: " + this.price);
	}

}
