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
		<h2>SignUp ȭ��</h2>
				
		<% if(userVO.isActive()) { %>
			ȸ�������� ȯ���մϴ�
		<% }else {%>
			ȸ�����Կ� �����ϼ̽��ϴ� �ٽ� �ۼ����ּ���
		<%} %>
		<p><p><a href='/homework03/homework03/findUser.html'>����������</a>
		
		</body>
		</html>