package com.joker.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joker.board.db.BoardDAO;
import com.joker.board.db.BoardDTO;
import com.joker.member.service.Action;
import com.joker.member.service.ActionForward;

public class BoardContent implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("BoardContent");
		// get ������� �Ѿ�� �� ����
		String section = request.getParameter("section");
		String num = "1";
		if(request.getParameter("num") != null){
			num = request.getParameter("num");
		}
		int no = Integer.parseInt(request.getParameter("no"));
		String sel = request.getParameter("sel");
		String find = request.getParameter("find");
		
		BoardDAO manager = BoardDAO.getInstance();
		// ��ȸ�� ������Ʈ
		manager.readcountUpdate(no);
		// �ش� �Խñ��� ������ �˻�
		BoardDTO content = manager.boardContent(no);
		
		// boardContent.jsp�� ������ ����
		request.setAttribute("content", content);
		request.setAttribute("section", section);
		request.setAttribute("num", num);
		
		// �˻��Ͽ��� ��� ����
		if(sel != null && find != null){
			request.setAttribute("sel", sel);
			request.setAttribute("find", find);
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/boardContent.jsp");

		return forward;
	}
	
}
