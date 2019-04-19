<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<% 
/*
<c:set 		 : 변수생성, 값을 저장
<c:remove 	 : 변수삭제
<c:if 		 : 조건문(text="조건식")
<c:choose 	 : 여러가지 조건에 따른 처리 가능(if 보다 활용도 높다)
<c:forEach   : 반복문(개선된 for)
<c:forTokens : 토큰값(split, for문 결합)
<c:out 		 : JSTL 출력구문 (out 보다 ${} 이 사용빈도가 높다)
<c:catch     : 예외처리
*/
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
table, tr, td {

	border:2px solid black;
}

</style>
<h3>EL parameter 받기</h3>
<!-- jsp?id=hong&pwd=1004 -->
${param.id} - ${param.pwd}<br>

<h3>EL & JSTL 혼합(의도 : scope 강제)</h3>
<c:set var = "userid" value = "${param.id}" scope = "request"></c:set>
<c:set var = "userpwd" value = "${param.pwd}" scope = "request"></c:set>

<table>
	<tr>
			<td>id</td>
			<td>${userid}</td>
	</tr>
	
	<tr>
			<td>pwd</td>
			<td>${userpwd}</td>
	</tr>
	</table>
	
id : ${userid}<br>
pwd : ${userpwd}<br>


<!-- JSTL IF문 -->
<c:if test="${empty userpwd}">
	<h3>empty userpwd</h3>
</c:if>

<hr>

<c:if test="${!empty userpwd}">
	<h3>not empty userpwd</h3>
	<c:if test="${userpwd == '1004' }">
	<h3>welcome Admin page</h3>
	</c:if>
</c:if>


</body>
</html>







