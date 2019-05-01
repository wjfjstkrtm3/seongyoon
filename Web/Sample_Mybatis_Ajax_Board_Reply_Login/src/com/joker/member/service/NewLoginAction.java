package com.joker.member.service;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.joker.member.db.MemberDAO;
import com.joker.member.db.MemberDTO;

public class NewLoginAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("NewLoginAction");
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberDTO member = new MemberDTO();
		MemberDAO manager = MemberDAO.getInstance();
		int result = manager.idCheck(id);
		
		if(result == 0){ // ���̵� ������
			out.println("<script>");
			out.println("alert('���̵� �����ϴ�.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}else if(!passwd.equals(manager.pwCheck(id))){ // ��й�ȣ�� �ٸ���
			out.println("<script>");
			out.println("alert('��й�ȣ�� �ٸ��ϴ�.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}else{ // �Է��� ���̵�� ��й�ȣ�� ��ġ�ϸ�
			member = manager.getMember(id);
			HttpSession session = request.getSession();
			session.setAttribute("id", member.getId());
			session.setAttribute("nickname", member.getNickname());
			request.setAttribute("result", result);
			out.print("<script>");
			out.print("window.close();");
			out.print("</script>");
			out.close();
		}
		
		return null;
	}
	
}
