package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.MemberDAO;

@Controller
public class LoginController {

	
	private MemberDAO memberDao;
	
	
	@Autowired
	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String form() {
		return "loginForm";
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String submit(@RequestParam(value="id") String id,
						 @RequestParam(value="pwd") String pwd,
						 HttpSession session) {
		
		boolean result = memberDao.memberCheck(id, pwd);
		String view = "";
		if(result) {
			session.setAttribute("USERID", id);
			view = "loginSuccess";
		} else {
			view = "loginForm";
		}
		
		return view;
	}
	
}
