<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="homework3.*" %>

<%
		request.setCharacterEncoding("EUC_KR");
		
		//html���� ���� �޾Ƽ� ���� �����ϱ� ex) String id = req.getParameter("id");
		String id = request.getParameter("id");
		
		System.out.println(id);
		//HttpSession session = request.getSession(true);
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session�� UserVO ���� Ȯ��"+userVO);
		
		if(!(id == null || id.equals(""))) {
			
			System.out.println("before dao");
			
			UserDAO userDAO = new UserDAO();
			userVO = userDAO.findUser(id);
			System.out.println(userVO);
			System.out.println("after dao");
		}
%>
				
		
		<html>
		<head></head>
		<body>
		<h2>SignUp ȭ��</h2>
				
		<% if(userVO != null && userVO.isActive()) { %>
			<%=userVO%>
			
			<%session.setAttribute("userVO", userVO);%>
		<% }else { %>
			���Ե� ������ �����ϴ�.
		<% }%>
		
		</body>
		</html>