<%@page import="java.util.HashMap"%>
<%@page import="kr.or.bit.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
table, tr, td {

	border:1px solid blue ;
	
}

</style>


<%-- <table>
<h1 style = "text-align: center">구구단 출력하기</h1>
<c:forEach var = "i" begin = "2" end = "9">
			<div>
			<tr>
			<td colspan = "2">${i}단</td>
			</tr>
			
			<c:forEach var = "j" begin = "1" end = "9">
			
			<tr>
			<td>${i}*${j}</td>
			<td>${i*j}</td>
			</tr>
			</div>
			</c:forEach>
			<br>
			
		
</c:forEach>
</table>


<c:forEach var = "i" begin = "1" end = "10">
<c:choose>
	<c:when test="${i==5}">
		<h1>${i}</h1>
	</c:when>
		<c:otherwise>
		<h3>${i}</h3>
		</c:otherwise>
	
</c:choose>

</c:forEach> --%>
	 
	 
<%
	int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

	for(int i : arr) {
		out.print("출력값 : "  + i );
		
	}
	
	session.setAttribute("sesarr", arr);
	request.setAttribute("reqarr", arr);
	System.out.print(session.getAttribute("sesarr"));
%>	 
	 
	 
	 
	 
</body>
</html>





<h1>session의 배열 값 출력하기</h1>

<c:set var = "ss" value = "${sessionScope.sesarr}"></c:set>

${ss}

<c:forEach var = "i" items="${ss}">
배열의 값은 : ${i}<br>
</c:forEach>


<c:forEach var = "zz" items = "<%=session.getAttribute(\"sesarr\") %>">

배열의 값 안담고 한번에 출력하기
${zz}

</c:forEach>


<h1>배열 담아서 쓰기</h1>

<c:set var = "qq" value = "<%=arr %>"></c:set>

<c:forEach var = "bb" items = "${qq}">
${bb }

</c:forEach>


<h1>배열 안담고 바로 사용</h1>
<c:forEach var = "pp" items = "<%= new int[]{10,20,30,40} %>">
${pp}

</c:forEach>


<h1>forEach 활용하기 2탄</h1>

<c:forEach var = "i" items = "<%=arr%>" varStatus="status">
index : ${status.index}&nbsp;&nbsp;&nbsp;
count : ${status.count}&nbsp;&nbsp;&nbsp;
배열 값 : ${i}<br>

</c:forEach>








