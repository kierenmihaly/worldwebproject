<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	//session ObjectScope ���� 
session.setAttribute("client", new jw09.Client());
%>

<%
	out.println("1.Sciptlet Tag �̿� session ���� Bean(Data) ȭ�鱸��");

	jw09.Client client = (jw09.Client) session.getAttribute("client");

	out.println("�̸�:" + client.getName() + "<br/>");
	String[] info = client.getInfo();
	for (int i = 0; i < info.length; i++) {
		out.println("info �迭�� index[" + i + "]:" + info[i] + "<br/>");
}
	
%>

2. EL�̿� session ���� Bean(Data)ȭ�鱸�� 

name: ${sessionScope.client.name}
addr: ${client.addr}<br/>
age: ${client.age}<br/>

info �迭�� empty : ${empty client.info }<br/>

info �迭�� index 0 value : ${sessionScope.client.info[0] }<br/>
info �迭�� index 1 value : ${client.info[1] }<br/>

