
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="kr.or.bit.utils.SingletonHelper"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	/*
이 페이지는 admin만 접근가능 ...

1. 회원목록 출력
2. 관리자만 접근 가능 (userid == admin)
3. 로그인한 일반 사용자가 주소값을 외워서 접근 불가 ... >> 로그인 페이지 이동
4. 고려사항 (권한처리 코드가 여러 페이지에 사용된다면)
      별도의 page구성 (include ... : sessionCheck.jsp)
*/
// 권한 처리
String id = (String)session.getAttribute("userid");
    
    if(id == null || !id.equals("admin")) {
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
	<table style="width: 900px; height: 500px; margin-left: auto; margin-right: auto;">
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
			
			<!-- 
				회원 목록 출력하기
				관리자인 경우 (회원 데이터 볼 수 있다)
				목록 출력 >> 상세 정보 별도 구성
				목록 : select id, ip from koreamember;
				회원데이터(HTML 결합) 출력 생성
					
			 -->
			 
       <%
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
          Class.forName("oracle.jdbc.OracleDriver");
          conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bituser", "1004");
          stmt = conn.createStatement();
          String sql = "select id, ip from koreamember";
          
          rs = stmt.executeQuery(sql);
          
          System.out.println("rs : " + rs);
          if(rs.next()) {
            do {
              %>
              <table style = "width: 400px;height:100px; margin-left: auto; margin-right: auto">
                <tr>
                  <th>이름</th>
                  <th>IP</th>
                </tr>
                <tr>
                  <td><a href="JDBC_MemberDetail.jsp?id=<%=rs.getString("id")%>"><%= rs.getString("id")%></a></td>
                  <td><%= rs.getString(2) %></td>
                  <td><a href="JDBC_MemberEdit.jsp?id=<%=rs.getString("id")%>">[수정]</a></td>
                  <td><a href="JDBC_MemberDelete.jsp?id=<%=rs.getString("id")%>">[삭제]</a></td>
                </tr> 
              </table>
    

              <% 
            } while(rs.next());
            %>
              <hr>
          <form action = "JDBC_MemberSearch.jsp" method = "post">
            회원명 : <input type = "text" name = "search">
                 <input type = "submit" value ="이름 검색 하기">
          </form>
        <hr>        
            <%
          }
          
        }catch(Exception e) {
          System.out.println(e.getMessage());          
        } finally {
          SingletonHelper.close(rs);
          SingletonHelper.close(stmt);
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