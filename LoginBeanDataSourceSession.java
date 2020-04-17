package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw04.UserDataSourceDao;
import jw04.UserVO;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class LoginBeanDataSourceSession extends HttpServlet {
       
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		HttpSession session = req.getSession(true);
		
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session에 저장된 UserVO유무 확인 : "+userVO);
		
		if (!(id == null || id.equals(""))) {
			userVO = new UserVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
			
			UserDataSourceDao userDsDao = new UserDataSourceDao();
			userDsDao.getUser(userVO);
		}
		
		
		////////////////////////JDBC종료
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		out.println("<h2>Login 화면 </h2>");
		
		if (userVO != null && userVO.isActive()) {
			out.println(userVO.getId()+"님 환영합니다.");
			session.setAttribute("userVO",userVO);
		}else {
			out.println("Login실패 id,pwd를 확인하세요");
		}
		
		out.println("<p><p><a href='/edu/jw05/loginBeanDataSourceSession.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
