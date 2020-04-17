package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieReaderToServer {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws 
	ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		Cookie[] cookies = req.getCookies();
		String userName = null;
		
		if(cookies != null) {
			out.println("client���� ���۵� Cookie�ֽ��ϴ�.");
			for(int i=0; i<cookies.length; i++) {
				String name = cookies[i].getName();
				String value = URLDecoder.decode(cookies[i].getValue());
				System.out.println("client�� ���� ���۵� cookie:"+name+"="+value);
				
				if(name.contentEquals("name")) {
					userName = value;
				}
			}
		}else {
			out.println("client���� ���۵� cookie�� �����ϴ�.<br/>");
		}
		out.println("<html><body>");
		if(userName==null) {
			out.println("ó���Դϴ�.");
		}else {
			out.println(userName+"�� ȯ��");
	}
		out.println("<body></html>");
}
	
}//class
