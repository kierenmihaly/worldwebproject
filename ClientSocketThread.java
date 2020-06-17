package net.client.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public class ClientSocketThread extends Thread{

	
	//Field
	private BufferedReader fromServer;
	private PrintWriter toServer;
	private Socket socket;
	private int timeOut = 3000;
	
	private boolean loopFlag;
	
	//con
	public ClientSocketThread() {
		
	}
	public ClientSocketThread(String connectIp, int connectPort) {
		
		try {
			
			this.socket = new Socket();
			socket.setSoTimeout(timeOut);
			
			socket.setSoLinger(true, timeOut);
			
			SocketAddress socketAddress = new InetSocketAddress(connectIp, connectPort);
			socket.connect(socketAddress,timeOut);
			
			toServer = 
					new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
			fromServer = 
					new BufferedReader(new InputStreamReader (socket.getInputStream(),"UTF-8"));
			
			loopFlag = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Method
	public void run() {
		
		System.out.println("[Client Thread]:ClientSocketTHread.run() START.....");
		
		while(loopFlag) {
			try {
				
				System.out.println("\n[CLient Thread]: Server�� data ����, �۽� ���� Loop");
				System.out.println("[���۹����Է� [�����Quit]]:");
				String toHostValue = new BufferedReader(new
				InputStreamReader(System.in)).readLine();
						
				if(toHostValue.contentEquals("Quit")) {
					break;
				}
				
				//server request
				toServer.println(toHostValue);
				
				String fromHostData = fromServer.readLine();
				
				if(fromHostData == null) {
					break;
				}
				
				System.out.println("::Server ���� ����Data:" +fromHostData);
				
			}catch(SocketTimeoutException stoe) {
				stoe.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
				
				loopFlag = false;
			}
		}//while
		
		//Socket 
		this.close();
		
		System.out.println("[Client Thread]; ClientSocketThread.run() END....");
	}//run
	
	public void close() {
		
		System.out.println("::close() start");
		
		try {
			
			if( toServer != null) {
				toServer.close();
				toServer = null;
			}
			
			if( fromServer != null) {
				fromServer.close();
				fromServer = null;
			}
			if( socket != null) {
				socket.close();
				socket = null;
			}
			Thread.sleep(timeOut);
}catch (Exception e) {
	e.printStackTrace();
}
		
		System.out.println("::close() end");
	}
}//class

