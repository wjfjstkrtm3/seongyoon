package dao;

import vo.Member;

public interface MemberDao {
	public Member getMember(String uid);
	
	public int insert(Member member);
}
