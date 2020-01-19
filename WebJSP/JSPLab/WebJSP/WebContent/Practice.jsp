<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
  	String data = "";
  	Cookie[] cookie = request.getCookies();
  	for(int i = 0; i < cookie.length; i++) {
  		if(cookie[i].getName().equals("cookie")) {
  		data =cookie[i].getValue();
  		System.out.println("쿠키 : " + data);
  		}
  	}
  
  %>
</head>
<script type="text/javascript">
	window.onload = function() {
	var data2 = '<%=data %>';
	document.getElementById("name").value = data2;
	console.log(data2);
		
	}

</script>

<body>


	<form action="Practice2.jsp" method="GET">
		이름:<input type="text" name="name" id="name"><br>
		비번:<input type="password" name="pwd">
		<input type="submit" value="전송하기">
	</form>
</body>
</html>