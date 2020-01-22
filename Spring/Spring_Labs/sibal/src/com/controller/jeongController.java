package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/uu/")
public class jeongController {
		
	@RequestMapping(value="jeong.do")
	public String aaaa() {
		return "/WEB-INF/views/cookie/CookieMake.jsp";
	}
}
