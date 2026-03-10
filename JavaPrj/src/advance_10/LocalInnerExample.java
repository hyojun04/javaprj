package advance_10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LocalInnerExample {
	private Frame f;
	
	public LocalInnerExample() {
		f = new Frame("Local Class 예제");
		
	}
	
	public void launchFrame() {
		class MyWindowAdapter extends WindowAdapter{
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300,200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		LocalInnerExample obj = new LocalInnerExample();
		obj.launchFrame();
	}

}
