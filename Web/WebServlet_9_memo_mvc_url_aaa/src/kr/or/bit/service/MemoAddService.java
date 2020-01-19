package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.MemoDao;
import kr.or.bit.dto.Memo;

public class MemoAddService implements Action{

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
        
    String id = request.getParameter("id");
    String email = request.getParameter("email");
    String content = request.getParameter("memo");
    
    MemoDao dao = new MemoDao();
    Memo m = new Memo();
    m.setId(id);
    m.setEmail(email);
    m.setContent(content);
    int row = dao.insertMemo(m);
    String url = "";
    String msg = "";
    
    if(row > 0) {
      url = "MemoList.do";
      msg = "등록성공";
    } else {
      url = "memo.html";
      msg = "등록실패";
    }
    request.setAttribute("url", url);
    request.setAttribute("msg", msg);
    
    
    ActionForward forward = new ActionForward();
    forward.setRedirect(false);
    forward.setPath("/WEB-INF/views/redirect.jsp");
    return forward;
  }

}
