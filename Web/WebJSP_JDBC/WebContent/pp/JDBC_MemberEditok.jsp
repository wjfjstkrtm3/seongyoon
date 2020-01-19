<%@page import="kr.or.bit.utils.SingletonHelper"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String admin = (String)session.getAttribute("userid");
  if(admin == null || !admin.equals("admin")) {
    response.sendRedirect("JDBC_login.jsp");
  }
  request.setCharacterEncoding("UTF-8");
  String name = request.getParameter("name");
  String age = request.getParameter("age");
  String email = request.getParameter("email");
  String gender = request.getParameter("gender");
  String id = request.getParameter("id"); 
  System.out.println(name + "/" + age + "/" + email + "/" + gender);

  Connection conn = null;
  PreparedStatement pstmt = null;
  
  try {
    conn = SingletonHelper.getConnection("oracle");
    String sql = "update koreamember set name = ?, age = ?, email = ?, gender = ? where id = ? ";
    pstmt = conn.prepareCall(sql);
    pstmt.setString(1, name);
    pstmt.setString(2, age);
    pstmt.setString(3, email);
    pstmt.setString(4, gender);
    pstmt.setString(5, id);
    int row = pstmt.executeUpdate();
    
    if(row > 0 ) {
      out.print("<script>alert('수정성공')</script>");
      response.sendRedirect("JDBC_Memberlist.jsp");
    } else {
      
    }
  } catch(Exception e) {
    System.out.println(e.getMessage());
  } finally {
    SingletonHelper.close(pstmt);
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
