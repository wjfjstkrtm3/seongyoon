package DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DTO.CustomUserDetails;



@Repository
public class UserAuthDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public CustomUserDetails getUserById(String username) {
		return sqlSession.selectOne("user.selectUserById", username);
	}
	
}
