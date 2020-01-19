<%@page import="kr.or.bit.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	
	boolean ook = false;
	if(name.equals(pwd)) {
		Cookie cookie = new Cookie("cookie", name);
		cookie.setMaxAge(30*30);
		response.addCookie(cookie);
		session.setAttribute("userid", name);
		ook = true;
	} else {
		out.print("<script>alert('틀렸다 세끼야')</script>");
		out.print("<script>location.href='Practice.jsp'</script>");	
	}


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<%
			if(ook == true) {
				out.print(session.getAttribute("userid") + "님 환영합니다");
				out.print("<a href='PracticeLogout.jsp'>로그아웃</a>");
			}
		%>
</body>
</html>