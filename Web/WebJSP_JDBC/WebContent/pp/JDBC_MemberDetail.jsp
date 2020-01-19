<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="kr.or.bit.utils.SingletonHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    String admin = (String)session.getAttribute("userid");
    if(admin == null || !admin.equals("admin")) {
      response.sendRedirect("JDBC_login.jsp");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: solid 2px black;
	border-collapse: collapse;
}

tr {
	border: solid 1px blue;
	background-color: white;
	color: black;
}

td {
	border: solid 1px red;
}
</style>
</head>
<body>
	<table
		style="width: 900px; height: 500px; margin-left: auto; margin-right: auto;">
		<tr>
			<td colspan="2">
				<jsp:include page="/common/Top.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td style="width: 200px">
				<jsp:include page="/common/Left.jsp"></jsp:include>
			</td>
			<td style="width: 700px">
				<%
					String id = request.getParameter("id");
						 Connection conn = null;
						 PreparedStatement pstmt = null;
						 ResultSet rs = null;
						 
						 try {
							 conn = SingletonHelper.getConnection("oracle");
							 String sql = "select id, pwd, name, age, gender, email from koreamember where id =?";
							 pstmt = conn.prepareStatement(sql);
							 pstmt.setString(1, id);
							 
							 rs = pstmt.executeQuery();
							 
							 /* rs.next(); */
							 while(rs.next()) {
				%>
					<table style="width: 500px; height: 400px; margin-left: auto; margin-right: auto;">
						<tr>
							<td style = "width: 100px">아이디</td>
							<td style = "width: 100px"><%=rs.getString("id")%></td>
						</tr>
						
						<tr>
							<td style = "width: 100px">비번</td>
							<td style = "width: 100px"><%=rs.getString("pwd")%></td>
						</tr>
						
						<tr>
							<td style = "width: 100px">이름</td>
							<td style = "width: 100px"><%=rs.getString("name")%></td>
						</tr>
						
						<tr>
							<td style = "width: 100px">나이</td>
							<td style = "width: 100px"><%=rs.getString("age")%></td>
						</tr>
						
						<tr>
							<td style = "width: 100px">성별</td>
							<td style = "width: 100px"><%=rs.getString("gender")%></td>
						</tr>
						
						<tr>
							<td style = "width: 100px">이메일</td>
							<td style = "width: 100px"><%=rs.getString("email")%></td>
						</tr>
						
						<tr>
							<td colspan ="2">
								<a href = "JDBC_Memberlist.jsp">목록가기</a>
							</td>
							
						</tr>
					
				</table>
			<%
				}
						 
					 } catch(Exception e) {
						 e.printStackTrace();
					 } finally {
						 SingletonHelper.close(rs);
						 SingletonHelper.close(pstmt);
					 }
			%>
				
				
			</td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="/common/Bottom.jsp"></jsp:include></td>
		</tr>
	</table>
</body>
</html>