package kr.or.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.bit.dto.memo;
import kr.or.bit.utils.SingletonHelper;

public class Practice {

	Connection conn = null;
	
	public void Practice() {
		
		conn = SingletonHelper.getConnection("oracle");
	}
	
	
	// 다중 select
	public List<memo> getListMemo() throws SQLException {
		List<memo> list = new ArrayList<memo>();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String sql = "select id, email, content from memo";
		
		pstmt = conn.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			memo m = new memo();
			m.setId(rs.getString(1));
			m.setEmail(rs.getString(2));
			m.setContent(rs.getString(3));
			list.add(m);
		}
		
		SingletonHelper.close(rs);
		SingletonHelper.close(pstmt);
		return list;
	}
	
	
	
	
	
	
	
	
	
}
