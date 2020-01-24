package com.model;

public interface MemberDAO {
	// 회원가입
	boolean memberInsert(String id, String name, String pwd, String email, int age);
	
	// 회원상세조회
	MemberVO selectMemberById(String id);
	
	// 회원유무 판단
	boolean memberCheck(String id, String pwd);

	
	
	
	
	
}
