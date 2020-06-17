package net.client;

import net.client.thread.ClientSocketThread;

public class EchoClientApp {
	
	//main method
	public static void main(String[] args) {
		
		System.out.println("======");
		System.out.println("[EchoCLientApp Main Thread] : STARTUP...\n");
		
		String connectIp = "127.0.0.1";
		int connectPort = 7000;
		
		ClientSocketThread clientSocketThread = new ClientSocketThread( connectIp, connectPort);
		clientSocketThread.start();
		
		try {
			clientSocketThread.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n[EchoClientApp Main Thread]: SHUTDOWN...");
		System.out.println("=========");
	}
}
