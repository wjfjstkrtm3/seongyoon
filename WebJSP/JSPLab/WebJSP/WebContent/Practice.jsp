<%@page import="kr.or.bit.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice</title>
</head>
<body>

	<%
	Emp e = (Emp)request.getAttribute("amumu");
	out.print(e.getEmpno() +"/" + e.getEname());
	%>

</body>
</html>