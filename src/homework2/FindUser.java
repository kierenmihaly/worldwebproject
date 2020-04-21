package homework2;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindUser extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		
	req.setCharacterEncoding("EUC_KR");
	res.setContentType("text/html;charset=euc-kr");
	PrintWriter out = res.getWriter();
	
	
	
	if(req.getParameter("name").equals("")||req.getParameter("sex").equals("")) {
		out.println("<script>");
		out.println("alert('아이디 비번 입력필수')");
		out.println("history.back();");
		out.println("</script>");
		
	}else {
		
		String name =req.getParameter("name");
		String sex = req.getParameter("sex");
		UserVO userVO = new UserVO();
	
		userVO.setName(name);	
		userVO.setSex(sex);
		
		
		UserDAO userDao = new UserDAO();
		try {
			userDao.addUser(userVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	out.println("<html>");
	out.println("<head></head>");
	out.println("<body>");
	out.println( name+" : "+sex);
	out.println(name +"님  회원정보 ");
	out.println("<br/><hr/>");
	if(req.getParameter("name") == userVO.getName()||req.getParameter("sex") == userVO.getSex()) {
		out.println("<script>");
		out.println("alert('이름 또는 성별이 다릅니다.')");
		out.println("history.back();");
		out.println("</script>");
	}else {
	out.println("이름 : "+userVO.getName()+"<br/>성별 : "+userVO.getSex()+"<br/>생년 : "
	+userVO.getBirth());
	}
	System.out.println(req.getParameter("name"));
	System.out.println(userVO.getName());
	out.println("</body>");
	out.println("</html>");
		}
	}//end of doPost
}//end of class
