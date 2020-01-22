package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sibal/")
public class sibalController {
		
	@RequestMapping(value="jebal.do", method=RequestMethod.GET)
	public String zz() {
		System.out.println("안녕");
		return "/WEB-INF/views/article/newArticleForm.jsp";
	}
	
	@RequestMapping(value="asd.do")
	public String zzz() {
		System.out.println("안녕2");
		return "/WEB-INF/views/article/newArticleSubmitted.jsp";
	}
	
}
