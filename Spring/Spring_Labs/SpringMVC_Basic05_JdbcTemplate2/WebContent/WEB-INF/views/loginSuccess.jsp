<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${sessionScope.USERID }"/> 님 환영합니다
	<a href="${pageContext.request.contextPath}/logout.do">로그아웃!!!</a>
</body>
</html>