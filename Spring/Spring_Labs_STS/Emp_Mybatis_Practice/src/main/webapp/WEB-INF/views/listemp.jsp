<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

#tableborder, #tableborder tr td {
	border: 1px solid black;
}


</style>
</head>
<body>

		<table id="tableborder">
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>직종</td>
			<td>매니저번호</td>
			<td>고용일</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
		
		</tr>
		<c:forEach var="emp" items="${list}">
		<tr>
		    <td>${emp.empno}</td>
		 	<td>${emp.ename}</td>
		 	<td>${emp.job}</td>
		 	<td>${emp.mgr}</td>
		 	<td>${emp.hiredate}</td>
		 	<td>${emp.sal}</td>
		 	<td>${emp.comm}</td>
		 	<td>${emp.deptno}</td>
		</tr>
		</c:forEach>
		</table>
</body>
</html>