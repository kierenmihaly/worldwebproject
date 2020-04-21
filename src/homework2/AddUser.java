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
		
		// Client Form Data ó��
		String name = req.getParameter("name");		// �̸�
		String sex = req.getParameter("sex");		// ����
		String birth = req.getParameter("birth");		// ��
		
		
		System.out.println("name = " + name);
		System.out.println("sex = " + sex);
		System.out.println("birth = " + birth);
		
		// UserVO instance ���� �� Client Form Data ����(Binding)
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setSex(sex);
		userVO.setBirth(birth);
		
		// DB ���� Data �˻� �� UserVO.active true / false ����
		UserDAO userdao = new UserDAO();
		userdao.addUser(userVO);
		
		if(session.isNew()) {
			session.setAttribute("userVO", userVO);
		}
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		if(userVO.isActive()) {
			out.print(name+"��  ");
			out.println("<h2> ���������ؿ�) </h2>");
		} else {
			out.println("�ٽ�Ȯ���ϼ���");
		}
		
		out.println("<p><p><a href='/homework02/findUser.html'>����������1</a>");
		out.println("<p><p><a href='/homework02/FindUser'>����������2</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
