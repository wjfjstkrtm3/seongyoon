package kr.or.bit.model;

import java.util.List;


public interface EmpDao {

	// List<BoardDTO> getBoardList(HashMap map);
	public List<EmpDto> selectAll();
	public EmpDto selectOne();
	public EmpDto selectSearch(int empno);
}
