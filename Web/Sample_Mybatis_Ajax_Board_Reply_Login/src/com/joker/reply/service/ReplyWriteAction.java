package com.joker.reply.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.joker.member.service.Action;
import com.joker.member.service.ActionForward;
import com.joker.reply.db.ReplyDAO;
import com.joker.reply.db.ReplyDTO;

public class ReplyWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		// �Ѿ�� �����͸� dto�� ����
		ReplyDTO dto = new ReplyDTO();
		dto.setBoard_no(Integer.parseInt(request.getParameter("no")));
		dto.setId(request.getParameter("id"));
		dto.setReply_content(request.getParameter("reply_content"));
		
		// db ������ ���� dao�� ������ ����
		ReplyDAO manager = ReplyDAO.getInstance();
		manager.insertReply(dto);
		
		return null;
	}
}
