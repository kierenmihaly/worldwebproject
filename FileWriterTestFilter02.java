import java.io.*;

public class FileWriterTestFilter02{

	public static void main(String[] args)throws Exception{

		BufferedReader br = null;
		BufferedWriter bw = null;

		br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���Ͽ� ������ ���� �Է��ض�");
		while(true){
			String str = br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str,0,str.length());
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();




			}//main
}//class