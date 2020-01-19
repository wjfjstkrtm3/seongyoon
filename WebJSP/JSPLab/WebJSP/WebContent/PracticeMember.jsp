<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String user = (String)session.getAttribute("userid");
		out.print("<h3>" + user + "님 환영합니다</h3>");
		out.print("<a href = 'PracticeLogout.jsp' style='color:red'>로그아웃</a>");
		
	
	%>


</body>
</html>