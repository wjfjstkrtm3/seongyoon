package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	@RequestMapping("/cookie/make.do")
	public String make(HttpServletResponse response ) {
		Cookie cookie = new Cookie("auth", "1004");
		response.addCookie(cookie);
		return "cookie/CookieMake";
	}
	@RequestMapping("/cookie/view.do")
	public String view(@CookieValue(value="auth", defaultValue="1") String auth) {
		System.out.println("클라이언트에서 read한 쿠키값 : " + auth);
		
		
		
		return "cookie/CookieView";
		
	}
	
	
	
	
}
