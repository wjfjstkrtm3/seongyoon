package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	
	@RequestMapping("/search/external.do")
	public ModelAndView searchInternal(@RequestParam(value="query", defaultValue="default") String query,
									   @RequestParam(value="p", defaultValue="1") int p) {
		
		System.out.println("param query : " + query);
		System.out.println("param p : " + p);
		return new ModelAndView("search/internal");
	}
}
