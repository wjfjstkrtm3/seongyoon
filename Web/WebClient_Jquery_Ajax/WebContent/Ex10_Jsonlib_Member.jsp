<%@page import="net.sf.json.JSONArray"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="net.sf.json.JSONObject"%>
<%@page import="kr.or.bit.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member = new Member();
	// String jsonstr = "{" + "username:" + membergetName() ...	
	JSONObject obj = JSONObject.fromObject(member);
	// {"address":"경기도 성남시","admin":"1","password":"1004","username":"bituser"}
	

%>

<%= obj %>
<%
	List<Member> memberlist = new ArrayList<>();
	memberlist.add(new Member("hong", "1004","서울시 강남구", "0"));
	memberlist.add(new Member("jeong", "1234","서울시 영등포구", "1"));
	memberlist.add(new Member("seong", "5678","서울시 동작구", "2"));
	
	JSONArray objarray = JSONArray.fromObject(memberlist);

%>

<%=objarray %>