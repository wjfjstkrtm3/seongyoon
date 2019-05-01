package com.joker.board.db;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class BoardDAO {
	private SqlSession session;
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	// myBatis
	private SqlSession getSession() {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("./SqlMapConfig.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession(true);
		} catch (IOException e) {
			System.out.println("getSession ���� : " + e);
			e.printStackTrace();
		}
		return session;
	}

	// �ش� section ����Ʈ ����
	public int getCount(String section) {
		int count = 0;
		try {
			session = getSession();
			count = (Integer) session.selectOne("board.board_count", section);
		} catch (Exception e) {
			System.out.println("getCount ���� : " + e);
			e.printStackTrace();
		}
		return count;
	}

	// �ش� section �˻� ���ڵ� ��
	public int getfCount(Map<String, Object> fMap) {
		int fCount = 0;
		try {
			session = getSession();
			fCount = (Integer) session.selectOne("board.board_fCount", fMap);
		} catch (Exception e) {
			System.out.println("getfCount ���� : " + e);
			e.printStackTrace();
		}
		return fCount;
	}

	// �ش� section ����¡ ó��
	public List<BoardDTO> getList(Map<String, Object> map) {
		List<BoardDTO> list = null;
		try {
			session = getSession();
			list = (ArrayList<BoardDTO>) session.selectList("board.board_list", map);
		} catch (Exception e) {
			System.out.println("getList ���� : " + e);
			e.printStackTrace();
		}
		return list;
	}

	// �ش� section �˻� ����¡ ó��
	public List<BoardDTO> getfList(Map<String, Object> map) {
		List<BoardDTO> list = null;
		try {
			session = getSession();
			list = (ArrayList<BoardDTO>) session.selectList("board.board_flist", map);
		} catch (Exception e) {
			System.out.println("getfList ���� : " + e);
			e.printStackTrace();
		}
		return list;
	}
	
	// �Խ��� �� �ۼ�
	public int boardWrite(BoardDTO dto){
		int result = 0;
		try {
			session = getSession();
			result = (Integer)session.insert("board.board_write", dto);
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println("boardWrite ���� : " + e);
			e.printStackTrace();
		}
		return result;
	}
	
	// ��ȸ�� ������Ʈ
	public void readcountUpdate(int no){
		try {
			session = getSession();
			session.update("board.readcount_update", no);
		} catch (Exception e) {
			System.out.println("readcountUpdate ���� : " + e);
			e.printStackTrace();
		}
	}
	
	// �Խ��� ��������
	public BoardDTO boardContent(int no){
		BoardDTO dto = null;
		try {
			session = getSession();
			dto = (BoardDTO) session.selectOne("board.board_content", no);
		} catch (Exception e) {
			System.out.println("boardContent ���� : " + e);
			e.printStackTrace();
		}
		return dto;
	}
	
	// �Խñ� ��õ���� �˻�
	public int recCheck(Map<String, Object> m){
		int result = 0;
		try {
			session = getSession();
			result = (Integer) session.selectOne("board.rec_check", m);
		} catch (Exception e) {
			System.out.println("recCheck : " + e);
			e.printStackTrace();
		}
		return result;
	}
	
	// �Խñ� ��õ
	public void recUpdate(Map<String, Object> m){
		try {
			session = getSession();
			session.insert("board.rec_update", m);
		} catch (Exception e) {
			System.out.println("recUpdate : " + e);
			e.printStackTrace();
		}
	}
	
	// �Խñ� ��õ ����
	public void recDelete(Map<String, Object> m){
		try {
			session = getSession();
			session.insert("board.rec_delete", m);
		} catch (Exception e) {
			System.out.println("recDelete : " + e);
			e.printStackTrace();
		}
	}
	
	// �Խñ� ��õ��
	public int recCount(int no){
		int count = 0;
		try {
			session = getSession();
			count = (Integer) session.selectOne("board.rec_count", no);
		} catch (Exception e) {
			System.out.println("recCount : " + e);
			e.printStackTrace();
		}
		return count;
	}
}
