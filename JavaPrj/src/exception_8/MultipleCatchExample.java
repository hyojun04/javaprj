package exception_8;

import java.io.FileInputStream;
import java.io.IOException;

public class MultipleCatchExample {

	public static void main(String[] args) {
	
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data : "+in2.read());
		}catch(NullPointerException | IOException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}finally {
			try {
				in2.close();
			}catch (IOException e) {}
		}
	}

}
