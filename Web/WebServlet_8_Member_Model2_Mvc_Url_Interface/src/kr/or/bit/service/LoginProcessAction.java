package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.MvcRegisterDao;

public class LoginProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String pwd = request.getParameter("pwd");
		
		MvcRegisterDao dao = new MvcRegisterDao();
		int result = dao.loginok(id, pwd);
		
		
		String resultdata = "";
		if(result >0) {
			resultdata = "아이디 찾았당";
		} else {
			resultdata = "아이디 못찾았당";
		}
		
		request.setAttribute("resultdata", resultdata);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/Register/login_welcome.jsp");
		

		return forward;
	}

}
