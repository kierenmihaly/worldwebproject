<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="homework3.*" %>

<%
		request.setCharacterEncoding("EUC_KR");
		//response.setContentType("text/html;charset=EUC_KR");
		//PrintWriter out = response.getWriter();
		
		

		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String birth = request.getParameter("birth");

		
		
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setSex(sex);
		userVO.setBirth(birth);

		
		System.out.println(userVO);
		System.out.println("before dao");
				
		UserDAO userDAO = new UserDAO();
		userDAO.addUser(userVO);
		System.out.println("after dao");
%>
		<html>
		<head></head>
		<body>
		<h2>SignUp 화면</h2>
				
		<% if(userVO.isActive()) { %>
			회원가입을 환영합니다
		<% }else {%>
			회원가입에 실패하셨습니다 다시 작성해주세요
		<%} %>
		<p><p><a href='/homework03/homework03/findUser.html'>내정보보기</a>
		
		</body>
		</html>