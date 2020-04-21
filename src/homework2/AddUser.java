package homework2;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class AddUser
 */
//@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doPost(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		HttpSession session = req.getSession(true);
		
		// Client Form Data 처리
		String name = req.getParameter("name");		// 이름
		String sex = req.getParameter("sex");		// 성별
		String birth = req.getParameter("birth");		// 년
		
		
		System.out.println("name = " + name);
		System.out.println("sex = " + sex);
		System.out.println("birth = " + birth);
		
		// UserVO instance 생성 및 Client Form Data 전달(Binding)
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setSex(sex);
		userVO.setBirth(birth);
		
		// DB 접근 Data 검색 비교 UserVO.active true / false 변경
		UserDAO userdao = new UserDAO();
		userdao.addUser(userVO);
		
		if(session.isNew()) {
			session.setAttribute("userVO", userVO);
		}
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		if(userVO.isActive()) {
			out.print(name+"님  ");
			out.println("<h2> 가입축하해요) </h2>");
		} else {
			out.println("다시확인하세요");
		}
		
		out.println("<p><p><a href='/homework02/findUser.html'>내정보보기1</a>");
		out.println("<p><p><a href='/homework02/FindUser'>내정보보기2</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
