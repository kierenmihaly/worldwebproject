<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


1.c:forEach �̿� Array ���۵Ǵ� ParamValues ���(begin=0,step=1�� ���)<br/>
<!-- 	paramValues�� EL���尴ü�� [�Ķ�����̸�,���ǹ迭]�� ������ Map ��ü  -->
	<c:forEach var="i" items = "${paramValues.sw }" begin="0" step="1">
		o�����Ͻ� sw��:${i}<br/>
	</c:forEach><br/>
	
2.c:foreach �̿� array ���۵Ǵ� ParamValues ���(begin,step ���� ���)<br/>
<c:foreach var="i" items ="${paramValues.sw}">
	o�����Ͻ� sw�� :${i}<br/>
	</c:foreach><br/>
	
3. c:forEach �̿� Map ���� ���۵Ǿ� ���� Param ���<br/>

<c:foreach var="i" items = "${param }">
	o${i.key}:${i.value}<br/>
</c:foreach><br/>

4. c:forEach �̿� Map ���� ���۵Ǿ� ���� Param ���<br/>

<c:foreach var="i" items = "${param }">
	<c:if test="${!empty param.name }">
		o${param.name}���� ���̴� ${param.age}�Դϴ�.<br/>
	</c:if>
</c:foreach><br/>

5. c:forEach �̿� Map ���� ���۵Ǿ� ���� Param ���<br/>

<c:foreach var="i" items = "${param }">
	<c:if test="${i.key =='name' }">
		o${param.name}���� ���̴� ${param.age}�Դϴ�.<br/>
	</c:if>
</c:foreach><br/>