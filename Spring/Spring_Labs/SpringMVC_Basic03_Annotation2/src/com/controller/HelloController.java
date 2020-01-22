package com.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		System.out.println("[hello.do start]");
		ModelAndView mv = new ModelAndView();
		System.out.println("getGreeting : " + getGreeting());
		mv.addObject("greeting", getGreeting());
		mv.setViewName("Hello");
		return mv;
	}
	
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String data ="";
		
		if(hour >=6 && hour <= 10) {
			data="학습시간";
		} else if(hour >= 11 && hour <= 15) {
			data="배고픈시간";
		} else if(hour >=16 && hour <= 18) {
			data="졸려운시간";
		} else {
			data = "go home";
		}
		return data;
	}
	
}
