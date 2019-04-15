<%@page import="kr.or.bit.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	 
	/* int empno = Integer.parseInt(request.getParameter("txtempno"));
	String ename = request.getParameter("txtename"); */

	/* Emp e = new Emp();
	e.setEmpno(empno);
	e.setEname(ename);
	
	session.setAttribute("emp", e); */
%>
<%-- <jsp:useBean id="usebean1" class = "kr.or.bit.Emp" scope = "session"></jsp:useBean>
<jsp:setProperty property="empno" name="usebean1" param = "txtempno"/>
<jsp:setProperty property="ename" name="usebean1" param = "txtename"/>
 --%>
 <jsp:useBean id="usebean2" class = "kr.or.bit.Emp" scope = "session"></jsp:useBean>
 <jsp:setProperty property="*" name="usebean2"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	맞노?<jsp:getProperty property="empno" name="usebean2"/>
	맞나?<jsp:getProperty property="ename" name="usebean2"/>
	<%=usebean2.getEmpno() %>
	<%=usebean2.getEname() %>
</head>

	
	
	
</body>
</html>