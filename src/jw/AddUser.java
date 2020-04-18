package jw;

import java.io.IOException;
//import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class AddUser extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String birth = req.getParameter("birth");
	
		
		
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setSex(sex);
		userVO.setBirth(birth);
	
		
		UserDao userDao = new UserDao();
		try {
			userDao.getUser(userVO);
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println( name+" : "+sex+": "+birth );
		out.println("환영합니당 우하하하");
	
		out.println("</body>");
		out.println("</html>");
		
	}
}
