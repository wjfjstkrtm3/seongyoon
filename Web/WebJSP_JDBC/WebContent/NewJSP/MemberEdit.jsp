
<%@page import="kr.or.bit.utils.SingletonHelper"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<link rel = "stylesheet" href = "css/Detail_Table.css">

<jsp:include page="common/head.jsp" />
</head>
<body>
<jsp:include page="common/header.jsp" />
<div class="center-area">
  <jsp:include page="common/aside.jsp" />
  <main>
<%
	 if(session.getAttribute("userid") == null || !session.getAttribute("userid").equals("admin")) {
	out.print("<script>location.href = 'Login.jsp'</script>");
	// 강제로 다른 페이지로 이동 
	
} 
String id = request.getParameter("id");
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
	 conn = SingletonHelper.getConnection("oracle");
	 String sql = "select id, pwd, name, age, trim(gender), email from koreamember where id = ?";
	 pstmt = conn.prepareStatement(sql);
	 pstmt.setString(1, id);
	 
	 rs = pstmt.executeQuery();
	 
	 rs.next();
%>  


<table class = "container">
				<form action="MemberEditok.jsp" method="post">

					
					<div>
						<table style="width: 400px; height: 200px; margin-left: auto; margin-right: auto; margin-top:100px;">
							<tr>
								<td>아이디</td>
								<td>
								  <input type = "text" name = "id" value ="<%=rs.getString("id")%>" readonly>
								</td>
							</tr>
							<tr>
								<td>비번</td>
								<td><%=rs.getString("pwd")%></td>
							</tr>
							<tr>
								<td>이름</td>
								<td>
								<input type = "text" name = "name" value = "<%=rs.getString("name")%>" style = "background-color:gold">
								</td>
							</tr>
							<tr>
								<td>나이</td>
								<td>
								<input type = "text" name = "age" value = "<%=rs.getString("age")%>" style = "background-color:gold">	
								</td>
							</tr>
							<tr>
								<td>성별</td>
								<td>
									[<%=rs.getString(5)%>]
									<input type="radio" name="gender" id="gender" value="여"
									<%if (rs.getString(5).equals("여")) {%>checked<%}%>>여자
									<input type="radio" name="gender" id="gender" value="남"
									<%if (rs.getString(5).equals("남")) {%>checked<%}%>>남자
								</td>
							</tr>
							<tr>
								<td>이메일</td>
								<td>
								<input type = "text" name = "email" value = "<%=rs.getString("email")%>" style = "background-color:gold">
								</td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="수정하기">
								<a href='MemberList.jsp'>리스트이동</a></td>
						</table>

					</div>
				</form>
		
		
		
	
  </main>
</div>
<jsp:include page="common/footer.jsp" />
<%
	} catch(Exception e) {
	e.printStackTrace();
	
} finally {
	 SingletonHelper.close(rs);
	 SingletonHelper.close(pstmt);
	
}
%>

