package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.MemoDao;

public class MemoIdCheckService implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
    
    
    String id = request.getParameter("id");
    MemoDao dao = new MemoDao();
    String result = dao.memoIdCheck(id);
    
    request.setAttribute("result", result);
    
    ActionForward forward = new ActionForward();
    forward.setRedirect(false);
    forward.setPath("/WEB-INF/views/uservalid.jsp");
    return forward;
  }

}
