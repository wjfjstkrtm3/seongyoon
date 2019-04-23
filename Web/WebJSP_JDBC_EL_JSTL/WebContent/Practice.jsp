<%@page import="java.util.HashMap"%>
<%@page import="kr.or.bit.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
table, tr, td {
	border:1px solid blue ;
}
</style>
<!-- <form action="Ex08_Basic_EL_JSTL_Quiz.jsp" method="post">
            JAVA:<input type="checkbox" name="subject" value="java"><br>
            JSP:<input type="checkbox" name="subject" value="jsp"><br>
            ORACLE:<input type="checkbox" name="subject" value="oracle"><br>
            MYSQL:<input type="checkbox" name="subject" value="mysql"><br>
            <hr>
            SELECT YEAR: <input type="text" name="year" value="2016"><br>
            CHOICE : <input type="text" name="choiceyn" value="y"><br>
        
            <input type="submit" value="전송하기">
        </form> -->
		<c:choose>
			선택은 : 
			<c:when test="${!empty paramValues.subject }">
				<c:forEach var = "obj" items = "${paramValues.subject }">
				 <li>${paramValues.subject}</li>
				</c:forEach>

			</c:when>
			
			<c:otherwise>
				아무것도없습니다
			</c:otherwise>
		</c:choose>
		
		

		
	 
	 
	 
</body>
</html>














