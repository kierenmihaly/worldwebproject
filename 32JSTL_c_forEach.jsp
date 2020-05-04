<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


1.c:forEach 이용 Array 전송되는 ParamValues 출력(begin=0,step=1인 경우)<br/>
<!-- 	paramValues는 EL내장객체로 [파라미터이름,갑의배열]을 저장한 Map 객체  -->
	<c:forEach var="i" items = "${paramValues.sw }" begin="0" step="1">
		o선택하신 sw는:${i}<br/>
	</c:forEach><br/>
	
2.c:foreach 이용 array 전송되는 ParamValues 출력(begin,step 없는 경우)<br/>
<c:foreach var="i" items ="${paramValues.sw}">
	o선택하신 sw는 :${i}<br/>
	</c:foreach><br/>
	
3. c:forEach 이용 Map 으로 전송되어 오는 Param 출력<br/>

<c:foreach var="i" items = "${param }">
	o${i.key}:${i.value}<br/>
</c:foreach><br/>

4. c:forEach 이용 Map 으로 전송되어 오는 Param 출력<br/>

<c:foreach var="i" items = "${param }">
	<c:if test="${!empty param.name }">
		o${param.name}님의 나이는 ${param.age}입니다.<br/>
	</c:if>
</c:foreach><br/>

5. c:forEach 이용 Map 으로 전송되어 오는 Param 출력<br/>

<c:foreach var="i" items = "${param }">
	<c:if test="${i.key =='name' }">
		o${param.name}님의 나이는 ${param.age}입니다.<br/>
	</c:if>
</c:foreach><br/>