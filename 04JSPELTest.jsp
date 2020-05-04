<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	//session ObjectScope 저장 
session.setAttribute("client", new jw09.Client());
%>

<%
	out.println("1.Sciptlet Tag 이용 session 저장 Bean(Data) 화면구성");

	jw09.Client client = (jw09.Client) session.getAttribute("client");

	out.println("이름:" + client.getName() + "<br/>");
	String[] info = client.getInfo();
	for (int i = 0; i < info.length; i++) {
		out.println("info 배열의 index[" + i + "]:" + info[i] + "<br/>");
}
	
%>

2. EL이용 session 저장 Bean(Data)화면구성 

name: ${sessionScope.client.name}
addr: ${client.addr}<br/>
age: ${client.age}<br/>

info 배열은 empty : ${empty client.info }<br/>

info 배열의 index 0 value : ${sessionScope.client.info[0] }<br/>
info 배열의 index 1 value : ${client.info[1] }<br/>

