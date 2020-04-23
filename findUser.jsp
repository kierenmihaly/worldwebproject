<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="homework3.*" %>

<%
		request.setCharacterEncoding("EUC_KR");
		
		//html에서 정보 받아서 변수 선언하기 ex) String id = req.getParameter("id");
		String id = request.getParameter("id");
		
		System.out.println(id);
		//HttpSession session = request.getSession(true);
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session에 UserVO 유무 확인"+userVO);
		
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
		<h2>SignUp 화면</h2>
				
		<% if(userVO != null && userVO.isActive()) { %>
			<%=userVO%>
			
			<%session.setAttribute("userVO", userVO);%>
		<% }else { %>
			가입된 정보가 없습니다.
		<% }%>
		
		</body>
		</html>