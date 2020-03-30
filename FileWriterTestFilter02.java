import java.io.*;

public class FileWriterTestFilter02{

	public static void main(String[] args)throws Exception{

		BufferedReader br = null;
		BufferedWriter bw = null;

		br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("파일에 저장할 글을 입력해라");
		while(true){
			String str = br.readLine();
			if(str.equals("끝")){
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