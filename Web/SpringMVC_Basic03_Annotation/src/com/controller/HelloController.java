package com.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
public class NoticeController implements Controller {
단점 : controller 하나가 요청한개만 처리 ...
결국 요청 10개면 10개의 Controller 만들어야 할까 >> 아니여

그 대안 Annotation 사용하면 method 단위 매핑을 할 수 있다
결국 : 하나의 클래스가 요청 10개를 처리 할 수 있다 > 대신에 함수 10개
@Controller 사용하면 >> 함수 단위의 매핑이 가능하다
@RequestMapping >> 함수 단위 매핑
*/

@Controller 
public class HelloController {
  
      @RequestMapping("/hello.do") // hello.do 요청이 들어오면 이 함수를 실행 하겠다
      public ModelAndView hello() {
        System.out.println("[hello.do start]");
        ModelAndView mv = new ModelAndView();
        mv.addObject("greeting", getGretting());
        mv.setViewName("Hello");
        return mv;
      }
    
      // 필요하다면 일반 함수를 만들어서 사용가능
      public String getGretting() {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String data ="";
        if (hour >= 6 && hour <= 10) {
          data = "학습시간 ㅠㅠ";
        } else if (hour >=11 && hour <= 15) {
          data = "배고픈 시간 ㅠㅠ";
        } else if (hour >=16 && hour <= 18) {
          data = "졸려운 시간 ㅠㅠ";
        } else {
          data = "go home";
        }
        
        return data;
      }
  
    
    
    
    
  
}








