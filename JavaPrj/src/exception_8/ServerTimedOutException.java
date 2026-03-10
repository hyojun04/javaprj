package exception_8;

public class ServerTimedOutException extends Exception{
	private int port;
	
	public ServerTimedOutException(String msg, int port) {
		super(msg);
		this.port = port;
	}
	
	public int getPort() {
		return port;
	}
}
