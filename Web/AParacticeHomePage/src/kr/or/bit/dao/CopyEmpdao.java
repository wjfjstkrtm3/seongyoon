package kr.or.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import kr.or.bit.dto.CopyEmp;
public class CopyEmpdao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
	public CopyEmpdao() {
		try {
		Context context = new InitialContext();
		ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean login(String id, String pwd) {
		boolean login = false;
		try {
			conn = ds.getConnection();
			String sql = "select * from adminlist where userid = ? and pwd = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();			
			if(rs.next()) {
				login = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return login;	
	}
	
	public List<CopyEmp> selectAll() {
		
		List<CopyEmp> list = new ArrayList<CopyEmp>();
		try {
			conn = ds.getConnection();
			String sql = "select * from copyemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CopyEmp emp = new CopyEmp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				list.add(emp);
			}
			
	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				
			}
		}
		return list;
		
	}
	
}
