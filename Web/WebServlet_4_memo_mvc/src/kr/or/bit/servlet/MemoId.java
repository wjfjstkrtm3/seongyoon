package kr.or.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
id 검증 (사용자가 입력한 id) DB에 있는지 없는지 확인
isCheckById 사용해서
return "false" or "true"
 
 */

import kr.or.bit.dao.memodao;
import kr.or.bit.dto.memo;

@WebServlet("/MemoId")
public class MemoId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MemoId() {
     
    }
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
			
			
			
			
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charse=UTF-8");
			String id = request.getParameter("id");
			
			System.out.println(id);
			memodao dao = new memodao();
			String idcheck = dao.isCheckById(id);
			out.print(idcheck);
			
			
	
			

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
