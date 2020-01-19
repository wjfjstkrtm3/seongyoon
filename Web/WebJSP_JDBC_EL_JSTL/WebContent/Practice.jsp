<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="kr.or.bit.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

  
</head>
<body>
<h3>숫자관련</h3>
변수선언 : <c:set var="price" value="1000000"></c:set>
변수값 출력 : ${price}<br>
  <fmt:formatNumber value="${price}" type="number"></fmt:formatNumber><br>
  <fmt:formatNumber value="50000000" type="currency" currencySymbol="$"/><br>
  <fmt:formatNumber value="0.13" type="percent"></fmt:formatNumber><br>
  변수에 설정<br>s
  <fmt:formatNumber value="123456789" pattern="###,###,###" var="pdata"></fmt:formatNumber>
  변수에 설정한 값 : ${pdata}<br>
  
  <hr>
  
  <h3>날짜 관련 format</h3>
  변수선언 <c:set var="now" value="<%=new Date() %>"/>
  
  변수값 : ${now }
  Basic Date : <fmt:formatDate value="${now}" type="date"/><br>
  DateStyle(full) : <fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
  DateStyle(short) : <fmt:formatDate value="${now}" type="date" dateStyle="short"/><br>
  시간<fmt:formatDate value="${now}" type="time"/><br>
 날짜 + 시간<fmt:formatDate value="${now}" type="both"/><br>
 혼합 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" /><br>
 혼합 :<fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short" /><br>
 
 
 돈 : <fmt:formatNumber value="1000000" type="currency" currencySymbol="%"/>
 
 
 
 
 
 
 <h1>날짜 혼자찍어보기</h1>
 
 <c:set var="now" value="<%=new Date() %>"></c:set>
 
 현재 날짜 : <fmt:formatDate value="${now}" type="date"/><br>
FULL : <fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
Short : <fmt:formatDate value="${now }" type="date" dateStyle="short"/><br>
시간 : <fmt:formatDate value="${now}" type="time" timeStyle="short"/><br>
혼합 : <fmt:formatDate value="${now }" type="both"/><br>

돈  : <fmt:formatNumber value="01012341234" pattern="###,####,####"></fmt:formatNumber>
</body>
</html>














