package kr.or.bit.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.CopyEmpdao;
import kr.or.bit.dto.CopyEmp;


public class CopyEmplist implements Action{
    ActionForward forward = null;
    CopyEmpdao dao = new CopyEmpdao();
    List<CopyEmp> emplist = dao.selectAll();
    
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		 
	    request.setAttribute("list", emplist);
	    forward = new ActionForward();
	    forward.setRedirect(false);
	    forward.setPath("/WEB-INF/views/list.jsp");
	    
	    return forward;
	}
   
}
