package com.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
public class HelloController implements Controller  
단점 :  Controller 하나고 요청 한개만 처리 ...
결국 요청 10개면 10개의 Controller 만들어야 할까 >> 아니오

그 대한 annotation 사용하면 method  단위의 매핑을 할 수 있다
결국 : 하나의 클래스가 요청 10개를 처리 > 대신에 함수 10개

*****@Controller 사용하면 >> 함수 단위의 매핑이 가능 *****
*****@RequestMapping >> 함수 단위 매핑*****

*/
@Controller
public class HelloController {

	@RequestMapping("/hello.do") // /hello.do 요청이 들어오면 함수 실행
	public ModelAndView hello() {
		System.out.println("[ hello.do start]");
		ModelAndView mv = new ModelAndView();
		mv.addObject("greeting",getGreeting());
		mv.setViewName("Hello");
		return  mv;
	}
	
	//필요하다면 일반 함수 만들어서 사용가능
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String data="";
		if(hour >= 6 && hour <= 10) {
			data="학습시간";
		}else if(hour >=11 && hour <= 15) {
			data="배고픈시간";
		}else if(hour >=16 && hour <= 18) {
			data="졸려운시간";
		}else {
			data="go home";
		}
		
		return data;
	}
}









