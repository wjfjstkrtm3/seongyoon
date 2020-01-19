<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


  <%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String mname = request.getParameter("mname");
    int age = Integer.parseInt(request.getParameter("age"));
    String gender = request.getParameter("gender");
    String email = request.getParameter("email");
    System.out.println(id + "/" + pwd + "/" + mname + "/"+ age +"/" + gender + "/"+ email);
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
        Class.forName("oracle.jdbc.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bituser", "1004");
        String sql = "insert into koreamember(id, pwd, name, age, gender, email, ip) values(?, ?, ?, ?, ?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        pstmt.setString(3, mname);
        pstmt.setInt(4, age);
        pstmt.setString(5, gender);
        pstmt.setString(6, email);
        pstmt.setString(7, request.getRemoteAddr());
        
        int row = pstmt.executeUpdate();
        
        if(row > 0) {
          System.out.println("회원가입 성공");
          response.sendRedirect("JDBC_login.jsp");
        } else {
          out.print("<script>alert('회원가입 실패')</script>");
          out.print("<script>location.href('JDBC_login.jsp')");
        }
    } catch(Exception e) {
      System.out.println("오류 : " + e.getMessage());
    } finally {
      if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
    }
    
    
    
  %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
</body>
</html>