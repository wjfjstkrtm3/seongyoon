package com.joker.member.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joker.member.db.MemberDAO;
import com.joker.member.db.MemberDTO;

public class MemberJoin implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("MemberJoin");
		// out ��ü���� ����� Ÿ��
		response.setContentType("text/html;charset=utf-8");
		// out ��ü ����
		PrintWriter out=response.getWriter();
		// post ������� �Ѿ���� �������� ���ڵ� Ÿ�� ����
		request.setCharacterEncoding("utf-8");
		// ������ �Ѿ�� id�� ����
		String id = request.getParameter("id");
		// DAO ��ü ����
		MemberDAO manager = MemberDAO.getInstance();
		// ���̵� �ߺ��˻�
		int result = manager.idCheck(id);
		
		if(result != 0){
			out.println("<script>");
			out.println("alert('������ ���̵� �ֽ��ϴ�.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}else{
			// ������ id�� ������ DTO ��ü�� ���� �����Ͽ� DAO�� ����
			MemberDTO member = new MemberDTO();
			member.setId(id);
			member.setPasswd(request.getParameter("passwd"));
			member.setName(request.getParameter("name"));
			member.setEmail(request.getParameter("email"));
			member.setNickname(request.getParameter("nickname"));
			manager.memberJoin(member);
		}
		// ������ ��� �� ��� ����
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./LoginForm.do");
		
		return forward;
	}
}
