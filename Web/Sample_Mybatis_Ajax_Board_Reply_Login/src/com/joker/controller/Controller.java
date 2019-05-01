package com.joker.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joker.board.service.BoardContent;
import com.joker.board.service.BoardList;
import com.joker.board.service.BoardWrite;
import com.joker.board.service.RecCount;
import com.joker.board.service.RecUpdate;
import com.joker.member.service.Action;
import com.joker.member.service.ActionForward;
import com.joker.member.service.LogOut;
import com.joker.member.service.LoginAction;
import com.joker.member.service.MemberJoin;
import com.joker.member.service.MemberUpdate;
import com.joker.member.service.MemberUpdateForm;
import com.joker.member.service.NewLoginAction;
import com.joker.member.service.PasswdChange;
import com.joker.member.service.Withdrawal;
import com.joker.reply.service.GetReply;
import com.joker.reply.service.ReplyWriteAction;

/**
 * Servlet implementation class Controller
 */
@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println("requestURI : " + requestURI);
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);

		Action action = null;
		ActionForward forward = null;

		// ȸ������ ��
		if (command.equals("/MemberJoinForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./member/memberJoinForm.jsp");
		}
		// ȸ������
		else if (command.equals("/MemberJoin.do")) {
			try {
				action = new MemberJoin();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// index �������� �̵�
		else if (command.equals("/Index.do")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./index.jsp");
		}
		// �α��� ������ �̵�
		else if (command.equals("/LoginForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./member/loginForm.jsp");
		}
		// �α���
		else if (command.equals("/LoginAction.do")) {
			try {
				action = new LoginAction();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��â �α�����
		else if (command.equals("/NewLoginForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./member/newLoginForm.jsp");
		}
		// ��â �α���
		else if (command.equals("/NewLoginAction.do")) {
			try {
				action = new NewLoginAction();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �α׾ƿ�
		else if (command.equals("/LogOut.do")) {
			try {
				action = new LogOut();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ���������� form
		else if(command.equals("/MemberUpdateForm.do")){
			try {
				action = new MemberUpdateForm();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ���� ����
		else if(command.equals("/MemberUpdate.do")){
			try {
				action = new MemberUpdate();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��й�ȣ ���� ��
		else if(command.equals("/PasswdChangeForm.do")){
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/passwdChangeForm.jsp");
		}
		// ��й�ȣ ����
		else if(command.equals("/PasswdChange.do")){
			try {
				action = new PasswdChange();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ȸ�� Ż��form
		else if (command.equals("/WithdrawalForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/withdrawalForm.jsp");
		}
		// ȸ�� Ż��form
		else if (command.equals("/Withdrawal.do")) {
			try {
				action = new Withdrawal();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �Խ��� ���
		else if (command.equals("/BoardList.do")) {
			try {
				action = new BoardList();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �Խ��� ���ۼ� form
		else if (command.equals("/BoardWriteForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./board/boardWriteForm.jsp?section="+request.getParameter("section"));
		}
		// �Խ��� ���ۼ�
		else if (command.equals("/BoardWrite.do")) {
			try {
				action = new BoardWrite();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �Խ��� �� ������
		else if (command.equals("/BoardContent.do")) {
			try {
				action = new BoardContent();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��õ�� ������Ʈ
		else if (command.equals("/RecUpdate.do")) {
			try {
				action = new RecUpdate();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��õ�� �˻�
		else if (command.equals("/RecCount.do")) {
			try {
				action = new RecCount();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��� ���
		else if (command.equals("/ReplyWriteAction.do")) {
			try {
				action = new ReplyWriteAction();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��� ���
		else if (command.equals("/GetReply.do")) {
			try {
				action = new GetReply();
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		// ������ �̵�
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		System.out.println("post");
		doProcess(request, response);
	}
}
