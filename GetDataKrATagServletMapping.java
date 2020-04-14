package jw02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{


		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		
		String clientNameKo = this.convertKo(clientName);
		String clientAddrKo = convertKo(clientAddr);


		System.out.println(clientNameKo+":"+clientAddrKo);

		out.println("<html>");
		out.println("<head><title>GetDataKrATag.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test <h2>");
		out.println("<li>�̸�:"+clientNameKo);
		out.println("<li>�ּ�:"+clientAddrKo);

		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>�ڷ�</a>");

		out.println("<p><a href='/edu/GetDataKrATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");

		out.println("</body>");
		out.println("</html>");

}



private String convertKo(String paramValue){
	String convertParamValue = null;
	try{
		byte[] b = paramValue.getBytes("8859_1");
		convertParamValue = new String(b,"EUC_KR");
	}catch(UnsupportedEncodingException uee) {
		System.out.println("�ѱ� ��ȯ�� Exception �߻�");

			uee.printStackTrace();
	}
	return convertParamValue;
}

}//class