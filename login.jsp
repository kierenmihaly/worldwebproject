<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="jw04.*"%>


<% if(request.getMethod().equals("GET")) {%>
	<jsp.forward page="login.html"/>
<% } %>

<% 


request.setCharacterEncoding("EUC_KR");
//response.setContentType("text/html;charset=EUC_KR");
//PrintWriter out = res.getWriter();

String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

//HttpSession session = req.getSession(true);

UserVO userVO = new UserVO();
userVO.setId(id);
userVO.setPwd(pwd);


UserDao userDAO = new UserDao();
userDAO.getUser(userVO);

/* <!-- 		////////////////////////JDBC종료 --> */
%>


<html>
<head>
</head>
<body>
	<h2>Login 화면</h2>
	<%
		if (userVO != null && userVO.isActive()) {
	%>
	<%= id  %>
	님 환영합니다.
	<%
		session.setAttribute("userVO",userVO); 
	%>
	<%
		} else {
	%>
	<!-- //Login 실패 id,pwd를 확인하세요. -->
	<!-- session.setAttribute("userVO",userVO); -->
		id,pwd를 확인하세요.
	<%
		}
	%>
	<p>
	<p>
		<a href='/edu/jw07/login.html'>뒤로</a>
</body>
</html>