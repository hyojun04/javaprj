package advance_10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerExample {
	private Frame f;
	
	public InnerExample() {
		f = new Frame("Inner 클래스 예제");
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300,200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		InnerExample ie = new InnerExample();
		ie.launchFrame();
	}
	
	private class MyWindowAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
