<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외처리 기타 등등 ...</title>
</head>
<body>
<c:out value="<p>태그는 문단 태그 입니다"></c:out>
<br>
일반 html 특수문자 : &lt;p&gt; 문단 태그
<br>
	<!-- cathc 구문안에서 예외가 발생하면 발생객체의 주소를 msg 변수에게 할당 -->
	<h3>예외처리</h3>
	<c:catch var = "msg">
		name : <%=request.getParameter("name") %>
		<%
			if(request.getParameter("name").equals("hong")) {
				out.print("당신의 이름은 : " + request.getParameter("name"));
			}
		%>
		
	</c:catch>
	<c:if test="${msg != null}">
		<h3>예외발생</h3>
		오류메시지:${msg}
	</c:if>	
	
</body>
</html>


