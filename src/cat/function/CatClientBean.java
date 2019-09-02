package cat.function;

import java.net.Socket;

/**
 * @author 15566
 */
//客服端
public class CatClientBean {

	private String name;
	private Socket socket;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}
}
