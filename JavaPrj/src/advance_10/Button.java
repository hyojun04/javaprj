package advance_10;

public class Button {
	private String label;
	
	public Button(String label) {
		this.label = label;
	}
	
	public void action(final int data) {
		class EventHandler{
			void callback() {
				System.out.println(label + "버튼의 이벤트 처리");
				System.out.println("이벤트핸들러에 전달된 값: "+data);
			}
		}
		new EventHandler().callback();
	}
}
