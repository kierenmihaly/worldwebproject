<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>

<%

	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	
	String address = "";
	int random = new java.util.Random().nextInt(3);
	if(random == 0){
		address = "서울";
	}else if(random ==1){
		address = "부산";
	}else{
		address = "제주도";
		}
		
		%>
		
		<%
		System.out.println("postJSON-orderServer.jsp :: 이름="+name+" 주소="+address+" 전화="+phone);
		
		JSONObject obj = new JSONObject();
		obj.put("name",name);
		obj.put("phone",phone);
		obj.put("address",address);
		
		System.out.println(obj);
		%>
		
		<%= obj %> 
		
		