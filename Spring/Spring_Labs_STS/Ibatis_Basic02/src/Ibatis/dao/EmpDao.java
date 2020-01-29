package Ibatis.dao;

import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import Ibatis.dto.Emp;

public class EmpDao {
	
	private static EmpDao instance = new EmpDao();
	private SqlMapClient sqlMap;
	
	private EmpDao() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("Config/SqlMapConfig.xml");
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch(Exception e) {
			
		}
	}
	
	public static EmpDao getInstacne() {
		return instance;
	}
	
	public void insertEmp(Emp e) throws SQLException {
		sqlMap.insert("insertEmp", e);
	}
	
	public Emp selectEmp(String ename) throws SQLException {
		return (Emp)sqlMap.queryForObject("selectEmp", ename);
	}
	
	
}
