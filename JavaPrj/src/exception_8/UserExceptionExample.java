package exception_8;

public class UserExceptionExample {
	String defaultServer = "javaspectialist.co.kr";
	String alternativeServer = "consolbook.com";
	
	public void connectMe(String serverName) throws ServerTimedOutException{
		int success;
		int portToConnect = 80;
		success = open(serverName, portToConnect);
		if (success ==0) {
			throw new ServerTimedOutException("Could not connect",80);
		}
	}
	
	public void findServer() {
		try {
			connectMe(defaultServer);
			System.out.println(defaultServer + "에 연결되었습니다.");
		}
		catch(ServerTimedOutException e) {
			System.out.println("Server timed out, trying alternative...");
			try {
				connectMe(alternativeServer);
				System.out.println(alternativeServer + "에 연결되었습니다.");
			}
			catch (ServerTimedOutException e1) {
				System.out.println("서버 연결에 실패했습니다.");
				System.out.println("Error : "+e1.getMessage() + "connecting to port" + e1.getPort());
			}
		}
	}
	public int open(String serverName, int port) {
		return (int)(Math.random()*2);
	}

	public static void main(String[] args) {
		UserExceptionExample ue = new UserExceptionExample();
		ue.findServer();
	}

}
