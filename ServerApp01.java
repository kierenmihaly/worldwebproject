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
		
		System.out.println("[Server]: Client�� ���� ��ٸ�");
		
		Socket socket = serverSocker.accept();
		System.out.println("[Server]: Client ����Ϸ�.....\n");
		
		BufferedReader fromClient =
				new BufferedReader( new InputStreamReader(socket.getInputStream(),"UTF-8"));
		PrintWriter toClient =
				new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
		
		System.out.println("[Server]: Client ���� �� data�� �ޱ����� ���� ����....\n");
		
		while(true) {
			
			String clientData = fromClient.readLine();
			
			System.out.println("[Server]: Client �� ���� ���۹��� Data-->..."+clientData);
			toClient.println("serverȸ��[Data receiver OK]");
		}
	}//main
}//class
