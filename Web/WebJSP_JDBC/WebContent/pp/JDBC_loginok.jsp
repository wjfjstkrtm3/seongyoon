<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
  request.setCharacterEncoding("UTF-8");
  String id = request.getParameter("id");
  String pwd = request.getParameter("pwd");
  
  Connection conn = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  try {
      Class.forName("oracle.jdbc.OracleDriver");
      conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bituser", "1004");
      String sql = "select id, pwd from koreamember where id = ?";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      
      rs = pstmt.executeQuery();
      
      if(rs.next()) {
       do {
         if(rs.getString("id").equals(id)) {
           
           if(rs.getString("pwd").equals(pwd)) {
           session.setAttribute("userid", rs.getString("id"));
           response.sendRedirect("JDBC_Main.jsp");
           } else {
             response.sendRedirect("JDBC_login.jsp");
           }
         } else {
           response.sendRedirect("JDBC_joinForm.jsp");
         }
       } while(rs.next());
      }
      
      
      
  } catch(Exception e) {
    System.out.println(e.getMessage());
  } finally {
    if(rs != null) try {rs.close();} catch(Exception e) {}
    if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
  }
  
  
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>