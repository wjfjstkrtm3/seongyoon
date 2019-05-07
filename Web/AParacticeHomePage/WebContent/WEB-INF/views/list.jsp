<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<title>사원 목록</title>
<link rel = "stylesheet" href = "<%=request.getContextPath()%>/css/list.css">
</head>
<body>

<c:set var = "list" value = "${requestScope.list}"></c:set>


  <div class = "container">
    <table class = "emptable">
      <tr>
      <td>EMPNO</td>
      <td>ENAME</td>
      <td>JOB</td>
      <td>MGR</td>
      <td>HIREDATE</td>
      <td>SAL</td>
      <td>COMM</td>
      <td>DEPTNO</td>
      </tr>
      
      <c:forEach var = "output" items = "${list}">
      <tr>
      <td>${output.empno}</td>
      <td>${output.ename}</td>
      <td>${output.job}</td>
      <td>${output.mgr}</td>
      <td>${output.hiredate}</td>
      <td>${output.sal}</td>
      <td>${output.comm}</td>
      <td>${output.deptno}</td>
      </tr>
      </c:forEach>
    
    
    </table>
  
  
  </div>
</body>
</html>
