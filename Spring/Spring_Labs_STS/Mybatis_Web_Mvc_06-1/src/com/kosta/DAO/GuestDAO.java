package com.kosta.DAO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kosta.Config.SqlSessionFactoryService;
import com.kosta.DTO.GuestDTO;

public class GuestDAO {
	private SqlSessionFactory factory;
	public GuestDAO() {
		factory = SqlSessionFactoryService.getSqlSession();
	}
	
	
	public int insert(GuestDTO guestobj) {
		SqlSession session = null;
		
		
		return 0;
	}
}
