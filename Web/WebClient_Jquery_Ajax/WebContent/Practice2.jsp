<%@page import="net.sf.json.JSONArray"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.or.bit.Emp"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

Class.forName("oracle.jdbc.OracleDriver");
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
System.out.println("오라클 드라이버 로딩");
		
// getConnection Connection인터페이스를 구현한 객체의 주소값을 리턴
conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bituser","1004");
System.out.println(conn.isClosed() + "정상 (False)"); // 너 연결 닫혔니

stmt = conn.createStatement();
String sql = "select empno, ename, sal, job from emp";

rs = stmt.executeQuery(sql);
	// 여러건 데이터 (객체로 담아 놓고 싶어요 : collection)
	// DTO 클래스 Emp
	// Emp emp = new Emp();

	List<Emp> list = new ArrayList<>();
	
	while(rs.next()) {
		Emp emp = new Emp();
		emp.setEmpno(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setSal(rs.getInt(3));
		emp.setJob(rs.getString(4));
		list.add(emp);	
	}

JSONArray jsonlist = JSONArray.fromObject(list);	
	
%>


<%= jsonlist %>





