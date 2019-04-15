<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="kr.or.kosta.utils.Singleton_Helper"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%

	if(session.getAttribute("userid") != null) {
		out.print("<b>[" + session.getAttribute("userid") + "]</b> 로그인상태");
		out.print("<a href ='Ex02_JDBC_Logout.jsp'>[로그아웃]</a>");
	} else {
		out.print("<b>로그인 하지 않으셨네요</b>");
		out.print("<a href = 'Ex02_JDBC_Login.jsp'>[로그인]</a>");
	}
	
	



%>



</head>
<body>

</body>
</html>