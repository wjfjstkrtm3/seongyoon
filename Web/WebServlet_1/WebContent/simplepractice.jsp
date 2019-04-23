<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연습입니당!!!!</h1>
	<p>1. 사용자로부터 입력받은 값 받기
	   2. 사용자의 요청 처리
	   3. 값을 보내야 하기때문에 request, session, application사용해서 보내ㅣ
	   4. requestDispatcher dis = request.getrequestDispacher(주소입력);
	   5. dis.forward(request, response);
	
	 </p>
	 
	 
	 <a href = "<%=request.getContextPath() %>/practice?type=date">date 찍기</a>
	 요청한 결과 출력 : <%=request.getAttribute("result") %>
	 
	



</body>
</html>