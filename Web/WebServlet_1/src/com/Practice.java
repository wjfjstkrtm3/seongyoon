package com;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Practice")
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Practice() {
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("클라이언트 요청");
		
		// 1. 사용자의 요청 파악 (요청 값 받기)
		String type = request.getParameter("type");
		
		// 2. 요청에 따른 업무수행 (service 실행)
		Object resultobj = null;
		if(type == null ||type.equals("greeting")) {
			resultobj = "hello world";
		} else if(type.equals("date")) {
			resultobj = new java.util.Date() + "헤헤ㅔ헤헤헤헤ㅔ헤";
		} else {
			resultobj = "invalid type";
		}
		
		// 3. 요청 완료에 따라서 그 결과를 요청한 사용자에게 전달
		// 정보를 저장 : request 객체, session 객체, application 객체
		request.setAttribute("result", resultobj);
		
		
		// 4. 결과를 보여주기 > 필요한 view를 지정한다
		// 화면을 출력 할 페이지를 정하고 -> 출력 할 데이터를 넘겨줘야한다
		// 제어권(forward)
		RequestDispatcher dis = request.getRequestDispatcher("/simpleview.jsp");
		// 내가 view로 지정한 곳에 forward 작업
		dis.forward(request, response);
		
		
				
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
