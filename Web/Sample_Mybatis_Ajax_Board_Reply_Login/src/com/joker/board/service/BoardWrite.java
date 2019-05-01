package com.joker.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joker.board.db.BoardDAO;
import com.joker.board.db.BoardDTO;
import com.joker.member.service.Action;
import com.joker.member.service.ActionForward;

public class BoardWrite implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		// ������ �Ѿ�� �����͸� ����
		String section = request.getParameter("section");
		String id = request.getParameter("id");
		String board_subject = request.getParameter("board_subject");
		String board_content = request.getParameter("board_content");
		String ip = request.getRemoteAddr();
		
		// dto ��ü�� ������ ����
		BoardDTO dto = new BoardDTO();
		dto.setSection(section);
		dto.setId(id);
		dto.setBoard_subject(board_subject);
		dto.setBoard_content(board_content);
		dto.setIp(ip);
		
		// dao ��ü ���� �� db ������ ���� �޼��� ȣ��
		BoardDAO manager = BoardDAO.getInstance();
		manager.boardWrite(dto);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/expro/BoardList.do?section="+section);
		
		return forward;
	}
	
}
