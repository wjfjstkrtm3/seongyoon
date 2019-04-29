<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action = "<%=request.getContextPath()%>/ok.do" method = "post">
			ID:<input type = "text" name = "id" placeholder="id입력">
			PWD:<input type = "password" name = "pwd" placeholder="pwd입력">
			EMAIL:<input type = "text" name = "email" placeholder="email입력">
			<input type = "submit" value = "회원가입">		
		</form>
		
</body>
</html>