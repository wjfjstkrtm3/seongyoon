package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.NewArticleCommand;
import com.service.ArticleService;

/*
클라이언트 요청
1. 화면주세요 (글쓰기 화면)   write.do
2. 처리해주세요 (글쓰기 처리) writeok.do

/article/newArticle.do (GET 방식, POST 방식) >> 요청 method (GET) , method (POST)
하나의 요청 : 화면 , 처리 

*/
@Controller
@RequestMapping("/article/newArticle.do")  //method GET ,POST 구분
public class NewArticleController {
	
	//NewArticleController 와 ArticleService
	private ArticleService articleservice;
	
	@Autowired
	public void setArticleservice(ArticleService articleservice) {
		this.articleservice = articleservice;
	}


	//GET 방식 요청 (사용자 화면단 제공)
	@RequestMapping(method=RequestMethod.GET) 
	public String form() {
		System.out.println("GET 방식에 대한 요청");
		return "article/newArticleForm";
		
	}
	
	
	
	//POST 방식 요청(글쓰기 처리)
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("Articledata")NewArticleCommand command) {
		articleservice.writeArticle(command);
		return "article/newArticleSubmitted";
	}
}
