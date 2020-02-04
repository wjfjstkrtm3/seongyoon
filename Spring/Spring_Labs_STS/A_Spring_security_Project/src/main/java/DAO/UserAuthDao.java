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

	public void updateFailureCount(String username) {
		System.out.println("updatecount하는곳");
		sqlSession.update("user.updateFailureCount", username);
	}
	
	public int checkFailureCount(String username) {
		System.out.println("여기가 null");
		return sqlSession.selectOne("user.checkFailureCount", username);
	}
	
	public void updateDisabled(String username) {
		sqlSession.update("user.updateUnenabled", username);
	}

	public void updateFailureCountReset(String username) {
		sqlSession.update("user.updateFailureCountReset", username);
	}

	public void updateNewAccessDate(String username) {
		sqlSession.update("user.updateAccessDate", username);
	}
	
	
	
}
