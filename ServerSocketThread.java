package base.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

public class ServerSocketThread extends Thread{

	// Field
	private BufferedReader fromClient;
	private PrintWriter toClient;
	private Socket socket;
	private List<ServerSocketThread> list;

	boolean loopFlag;

	// con
	public ServerSocketThread() {
	}

	public ServerSocketThread(Socket socket, List<ServerSocketThread> list) {

		this.socket = socket;
		this.list = list;

		try {

			fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			toClient = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			loopFlag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method
	public void run() {

		System.out.println("\n[ServerSocketThread (" + list.indexOf(this) + "):] :data를 수신,송신 Loop Start");

		String fromClientData = null;

		while (loopFlag) {
			try {
				if ((fromClientData = fromClient.readLine()) != null) {

					System.out.println("\n[ServerSocketThread (" + list.indexOf(this) + ")];Client 전송받은 Data ==>"
							+ fromClientData);
					toClient.println(fromClientData);

				} else {
					break;
				}

			} catch (SocketException se) {
				se.printStackTrace();
				loopFlag = false;
			} catch (Exception e) {
				e.printStackTrace();
				loopFlag = false;
			}

		} // while

		System.out.println("\n[ServerSocketThread(" + list.indexOf(this) + "):]; data를 수신,송신 Loop end");
		this.close();
	}

	public void close() {

		System.out.println("...close() start");

		try

		{

			if (toClient != null) {
				toClient.close();
				toClient = null;
			}

			if (fromClient != null) {
				fromClient.close();
				fromClient = null;
			}
			if (socket != null) {
				socket.close();
				socket = null;
			}

			list.remove(this);

			System.out.println("접속자수:" + list.size());

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("::close() end...\n");
	}

	// get/set/method
	public void setLoopFlag(boolean loopFlag) {
		this.loopFlag = loopFlag;

	}// class
}
