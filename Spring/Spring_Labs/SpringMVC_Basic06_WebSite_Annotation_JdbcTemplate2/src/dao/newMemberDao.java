package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import vo.Member;



public class newMemberDao implements MemberDao{

	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Member getMember(String uid) {
		
		
		
		return null;
	}

	@Override
	public int insert(Member member) {
		
		
		
		
		
		return 0;
	}

}
