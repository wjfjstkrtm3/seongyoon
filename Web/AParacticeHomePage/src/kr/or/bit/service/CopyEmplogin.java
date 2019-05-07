package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.CopyEmpdao;

public class CopyEmplogin implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
			ActionForward forward = new ActionForward();
			
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		
		System.out.println(id);
		System.out.println(pwd);
		CopyEmpdao dao = new CopyEmpdao();
		boolean result = dao.login(id, pwd);
		
		String msg = "";
		String url = "";
		
		System.out.println(result);
		if(result) {
			msg = "로그인성공>.<";
			url = "list.do";
		} else {
			msg = "로그인실패 ㅡㅡ";
			url = "login.html";
		}
		System.out.println(msg + url);
		 request.setAttribute("msg", msg);
		    request.setAttribute("url", url);
		    
		    forward.setRedirect(false);
		    forward.setPath("/WEB-INF/views/register.jsp");
		    
		    return forward;
	}

}
