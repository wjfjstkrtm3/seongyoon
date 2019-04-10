<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// JAVA 코드 구현
	String userid = request.getParameter("userid");
	String userpwd = request.getParameter("userpwd");
	String data = request.getParameter("data");
	String Readonly = request.getParameter("data2");
	String disabled = request.getParameter("data3");
	String aa = request.getParameter("sports");
// 	String sports_2 = request.getParameter("sports_2");
// 	String sports_3 = request.getParameter("sports_3");
	String year = request.getParameter("year");
	String gender = request.getParameter("gender");
	String hidden = request.getParameter("hdata");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>당신이 입력한  데이터는 뭘까요 ? ㅎㅎ 바바바ㅏㅏ바바ㅏㅂ바밤</h3>
	ID : <%= userid %><br>
	PWD : <%= userpwd %><br>
	Data : <%= data %><br>
	Readonly : <%= Readonly %><br> <!-- readonly는 읽기전용이고, 데이터가 넘어간다 -->
	disabled : <%= disabled %><br> <!-- disabled 는 비활성화고, 데이터가 넘어가지않는다 -->
	sports : <%= aa %><br>
<%-- 	sports_2 : <%= sports_2 %><br> --%>
<%-- 	sports_3 : <%= sports_3 %> --%>
	year : <%= year %><br>
	gender : <%= gender %><br>
	hidden : <%= hidden %>
</body>
</html>