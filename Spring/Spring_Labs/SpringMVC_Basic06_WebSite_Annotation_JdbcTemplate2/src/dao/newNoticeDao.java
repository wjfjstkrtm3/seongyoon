package dao;

import java.sql.SQLException;
import java.util.List;

import vo.Notice;

public class newNoticeDao implements NoticeDao{

	@Override
	public int getCount(String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Notice> getNotices(int page, String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String seq) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Notice notice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Notice getNotice(String seq) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Notice n) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
