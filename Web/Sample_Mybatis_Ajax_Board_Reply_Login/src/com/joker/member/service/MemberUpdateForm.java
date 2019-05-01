package com.joker.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.joker.member.db.MemberDAO;
import com.joker.member.db.MemberDTO;

public class MemberUpdateForm implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("MemberUpdateForm");
		
		HttpSession session = request.getSession();
		// session���� �����Ǿ� �ִ� id�� ������
		String id = (String) session.getAttribute("id");

		MemberDAO manager = MemberDAO.getInstance();
		// id�� �ش��ϴ� ������ ���ؿ�
		MemberDTO member = manager.getMember(id);
		// ���ؿ� �����͸� request �������� ����
		request.setAttribute("member", member);
		
		ActionForward forward = new ActionForward();
		// ���� ��ü�� �����Ƿ� dispatcher ��� ���(false) / �̵� ��� ����
		forward.setRedirect(false);
		forward.setPath("./member/memberUpdateForm.jsp");
		
		return forward;
	}
}
