<%@page import="net.sf.json.JSONObject"%>
<%@page import="kr.or.bit.Member"%>
<%@page import="net.sf.json.JSONArray"%>
<%@page import="kr.or.bit.Emp"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
  List<Member> memberlist = new ArrayList<Member>();
  memberlist.add(new Member("hong", "1004", "서울시 강남구", "0"));
  memberlist.add(new Member("jeong", "1234", "서울시 영등포구", "1"));
  memberlist.add(new Member("seong", "5678", "서울시 동작구", "2"));
  
  JSONArray arr = JSONArray.fromObject(memberlist);
  
  
  

%>

  <%= arr %>
 
