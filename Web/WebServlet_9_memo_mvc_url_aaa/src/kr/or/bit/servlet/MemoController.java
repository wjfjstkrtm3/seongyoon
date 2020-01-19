package kr.or.bit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.service.MemoAddService;
import kr.or.bit.service.MemoIdCheckService;
import kr.or.bit.service.MemoListService;


@WebServlet("*.do")
public class MemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemoController() {
        super();
    }
    
  protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String requestURI = request.getRequestURI();
    String contextPath = request.getContextPath();
    String url_Command = requestURI.substring(contextPath.length());
    
    ActionForward forward = null;
    Action action = null;
    
    if(url_Command.equals("/MemoAdd.do")) {
      action = new MemoAddService();
      forward = action.execute(request, response);
    }else if(url_Command.equals("/MemoList.do")) {
      action = new MemoListService();
      forward = action.execute(request, response);
    }else if(url_Command.equals("/MemoId.do")) {
      action = new MemoIdCheckService();
      forward = action.execute(request, response);
    }
    
    if(forward != null) {
      if(forward.isRedirect()) {
            response.sendRedirect(forward.getPath());
      } else {
        RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
        dis.forward(request, response);
      }
    }
    
  }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doProcess(request, response);
	}

}
