<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>

<body>

	 :: 10ResponseSendredirect.jsp.jsp ���� <br/>

	<% request.setAttribute("aaa",new String("�����")); %>

	<% response.sendRedirect("09JSPActionForward"); %>
	<% //response.sendRedirect("http://127.0.0.1:8080/edu/jw07/09JSPActionForward.jsp); %>
	<% //response.sendRedirect("http://www.daum.net"); %>

	
	:: 10ResponseSendredirect.jsp.jsp ��<br/><br/>
</body>
</html>