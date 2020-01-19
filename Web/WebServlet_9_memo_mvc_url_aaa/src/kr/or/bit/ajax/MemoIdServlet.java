package kr.or.bit.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.MemoDao;

/**
 * Servlet implementation class MemoIdServlet
 */
@WebServlet("/MemoIdServlet")
public class MemoIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemoIdServlet() {
        super();
    }

  protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("여기탓냐");
    String id = request.getParameter("id");
    MemoDao dao = new MemoDao();
    String result = dao.memoIdCheck(id);
    
    if(result == "true") {
      result = "ID 존재";
    } else {
      result = "ID 써도됨";
    }
    
    PrintWriter out = response.getWriter();
    out.print(result);
    
    
    
  }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doProcess(request, response);
	}
	

}
