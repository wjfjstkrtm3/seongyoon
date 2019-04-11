<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%
	/*  
	  쿠키값(사용자ID)이 존재하면 UID input value 속성을 그 값을 출력
	  쿠키값을 read 해서 쿠키 변수명이 UID 라면 ... 그 값을
	  
	 */
	 	String userid="";
		Cookie[] cookies = request.getCookies();
			for(int i = 0 ; i < cookies.length ; i++){
				if(cookies[i].getName().equals("UID")){
					/* out.print("값 : " + cookies[i].getMaxAge()); */
					userid = cookies[i].getValue();
				}
			}

	%>
</head>
<script type="text/javascript">
	window.onload = function(){
		var data ='<%=userid%>';
		console.log(data+"님");
		document.getElementById("UID").value=data;
	}
	
	
</script>
<body>
	<form action="Ex19_loginok.jsp" method="get">
		ID:<%-- <input type="text" name="UID" value="<%=userid%>"><br> --%>
		<input type="text" name="UID" id="UID"><br>
		PWD:<input type="password" name="PWD"><br>
		<hr>
		ID값 유지하기<input type="checkbox" name="chk">
		<hr>
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
	</form>
</body>
</html>