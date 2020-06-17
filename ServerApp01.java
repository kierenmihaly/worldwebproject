package base.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp01 {
	//main method
	public static void main(String[] args)throws Exception{
		
		ServerSocket serverSocker = new ServerSocket(7000);
		
		System.out.println("[Server]: Client의 접속 기다림");
		
		Socket socket = serverSocker.accept();
		System.out.println("[Server]: Client 연결완료.....\n");
		
		BufferedReader fromClient =
				new BufferedReader( new InputStreamReader(socket.getInputStream(),"UTF-8"));
		PrintWriter toClient =
				new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
		
		System.out.println("[Server]: Client 접속 후 data를 받기위한 무한 루프....\n");
		
		while(true) {
			
			String clientData = fromClient.readLine();
			
			System.out.println("[Server]: Client 로 부터 전송받은 Data-->..."+clientData);
			toClient.println("server회신[Data receiver OK]");
		}
	}//main
}//class
