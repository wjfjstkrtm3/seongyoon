package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MemberDAOImpl implements MemberDAO{

	
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	
	
	@Override
	public boolean memberInsert(String id, String name, String pwd, String email, int age) {
		String sql="insert into usermember(id,name,pwd,email,age) values(?,?,?,?,?)";
		boolean result = false;
		
			
		Object[] params = {id,name,pwd,email,age};
		if(this.jdbctemplate.update(sql,params) > 0)
		{
			result = true;
		}
		return result;
	}

	@Override
	public MemberVO selectMemberById(String id) {
		
		String sql = "select id, name, pwd, email, age from usermember where id =?";
		
		
		// Connection conn = null;
		// PrepareStatement pstmt = null;
		// ResultSet rs = null;
		
		// conn = DriverManager.getConnection();
		// String sql = "";
		// pstmt = conn.prepareStataement(sql);
		// pstmt.setId(id);
		// rs = pstmt.executeQuery();
		// while(rs.next()) {
		// emp.setName(rs.getString("name));
		
	
		
		return this.jdbctemplate.queryForObject(sql,
                new BeanPropertyRowMapper<MemberVO>(MemberVO.class),
                id);
	}

	@Override
	public boolean memberCheck(String id, String pwd) {
		
		String sql="select id, name, pwd, email, age from usermember where id=? and pwd=?";
		
		boolean result=false;
		Object[] params = {id,pwd};
		
		if(this.jdbctemplate.queryForList(sql, params).size() > 0) {
			result = true;
			
		}
		return result;
	}
	

	

	
	
	
}
