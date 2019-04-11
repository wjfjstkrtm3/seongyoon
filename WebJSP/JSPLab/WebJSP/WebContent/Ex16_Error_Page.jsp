<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="/error/commonError.jsp" %>

<!-- xml에서 전역으로 오류 메시지를 처리해도 되지만
     xml과 페이지에서 두개다 오류 메시지를 처리할 경우
          페이지 안에 있는 오류 메시지가 우선된다
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
1. 특정 페이지만 지정 : page errorPage : 모든 페이지 상단에 ... 유지보수가 어려워용


 -->
<%
		String data = request.getParameter("name").toLowerCase();
		/* request에서는 이미 값이 null이라 null에 lowercase를 때려서 오류	*/
%>
		전달받은 내용 : <%=data %>
</body>
</html>