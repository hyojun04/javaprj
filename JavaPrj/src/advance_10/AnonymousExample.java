package advance_10;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousExample {
	private Frame f;
	
	public AnonymousExample() {
		f=new Frame("Anonymous 예제");
	}
	
	public void launchFrame() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		f.setSize(300,200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AnonymousExample ae = new AnonymousExample();
		ae.launchFrame();
	}

}
