<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
		$(function() {
			var text = $("#search").val();
			console.log(text);
			$("#btn").click(function() {
				alert("회원을 검색합니다");
			$.ajax(
			{
				url:"listone.htm",
				type:"POST",
				data: $("#search").val(),
				success:function(data) {
					console.log(data);
				}
				
			}		
			)
			
			// console.log($("#search").val());
			});
		});



</script>
</head>


<body>
		<c:set var="selectone" value="${one}"></c:set>
		
		<input type="text" id="search" name="search" placeholder="사번을 입력하세요">
		<input type="submit" id="btn" name="btn" value="검색">
		
		<table>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>직종</td>
			<td>매니저번호</td>
			<td>고용일</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
		
		</tr>
			<tr>
				<td>${selectone.empno}</td>
				<td>${selectone.ename}</td>
				<td>${selectone.job}</td>
				<td>${selectone.mgr}</td>
				<td>${selectone.hiredate}</td>
				<td>${selectone.sal}</td>
				<td>${selectone.comm}</td>
				<td>${selectone.deptno}</td>
			</tr>
		</table>

	
</body>
</html>