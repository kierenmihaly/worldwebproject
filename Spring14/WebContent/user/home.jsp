<%@ page contentType="text/html;charset=euc-kr" %>

<%@ page import="spring.domain.User" %>

<!-- 
	1. �α��� ����Ȯ�� :: Work Flow Control
		�� ��α��� �ΰ��  : �α��� ȭ�� display 
	    �� �α����� ��� : �̹� �α��� �� ȸ������ display
	2. �α��� Ȯ����...
		�� �α����� ȸ���� session ObjectScope�� User��ü�� ����, active �� true
		�� User��ü�� ���� �� User�� active ���� true / false ������ �Ǵ�
====================================================
==> logon.jsp�� view  ���� ��  Work Flow Control (����� �ڵ�)�� ����
====================================================	
-->

<!-- 	#. �� �α����� ȸ�� -->
<%	User sessionUser = (User)session.getAttribute("sessionUser");	%>

<%	//if ( user == null  ||  ! user.isActive() )  { %>
		<%-- <jsp:forward page="/logon.jsp" /> --%>
<% //} %>

<!-- 	#. �α����� ȸ���̸� -->
<html>
	
	<head><title>Home Page</title></head>
	
	<body>
		<p>Simple Model2 Examples</p>
		<p> ȯ���մϴ�.  : <%= sessionUser.getUserId()%>��</p>

		<br/><br/>
		<!-- <a href = "logout.do">logout</a> -->
		<a href = "logout">logout</a>
	</body>
	
</html>