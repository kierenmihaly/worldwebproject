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

/* <!-- 		////////////////////////JDBC���� --> */
%>


<html>
<head>
</head>
<body>
	<h2>Login ȭ��</h2>
	<%
		if (userVO != null && userVO.isActive()) {
	%>
	<%= id  %>
	�� ȯ���մϴ�.
	<%
		session.setAttribute("userVO",userVO); 
	%>
	<%
		} else {
	%>
	<!-- //Login ���� id,pwd�� Ȯ���ϼ���. -->
	<!-- session.setAttribute("userVO",userVO); -->
		id,pwd�� Ȯ���ϼ���.
	<%
		}
	%>
	<p>
	<p>
		<a href='/edu/jw07/login.html'>�ڷ�</a>
</body>
</html>