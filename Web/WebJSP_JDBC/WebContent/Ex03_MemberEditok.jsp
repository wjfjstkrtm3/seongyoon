<%@page import="kr.or.bit.utils.SingletonHelper"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	/*
	1. 권한처리
	2. 한글처리
	3. 데이터 받기
	4. update koreamember set name = ?, age = ?, email = ?, gender = ?
		where id = ?
		
	5. 성공 : Ex03_Memberlist.jsp
	
	*/
	
	if(session.getAttribute("userid") == null || !session.getAttribute("userid").equals("admin")) {
		out.print("<script>location.href = 'Ex02_JDBC_Login.jsp'</script>");
		// 강제로 다른 페이지로 이동 
		
	}

	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String email = request.getParameter("email");
	String gender = request.getParameter("gender");
	
	 Connection   conn = null;
	 PreparedStatement pstmt = null;

	try {
		 conn = SingletonHelper.getConnection("oracle");
		 String sql = "update koreamember set name = ?, age = ?, email = ?, gender = ? where id = ?";
		 
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, name);
		 pstmt.setString(2, age);
		 pstmt.setString(3, email);
		 pstmt.setString(4, gender);
		 pstmt.setString(5, id);

		 
		 int row = pstmt.executeUpdate();
		 
		 if(row > 0) {
	 out.print("<script>location.href = 'Ex03_Memberlist.jsp'</script>");
	 
		 } else {
	 // 필요에 따라 구현
		 }
		 

	} catch(Exception e) {
		e.printStackTrace();
		
	} finally {
		
		 SingletonHelper.close(pstmt);
		
	}
%>
 