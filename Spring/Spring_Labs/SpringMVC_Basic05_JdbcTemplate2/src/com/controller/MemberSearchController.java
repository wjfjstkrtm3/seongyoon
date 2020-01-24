package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.MemberDAO;
import com.model.MemberVO;

@Controller
public class MemberSearchController {
			
	
	private MemberDAO memberDao;
	
	@Autowired
	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	@RequestMapping(value="/check.do", method=RequestMethod.GET)
	public String form() {
		return "memberSearch";
	}
	
	
	@RequestMapping(value="/check.do", method=RequestMethod.POST)
	public ModelAndView submit(@RequestParam(value="id") String id) {
		
		MemberVO membervo = null;
		ModelAndView mv = null;
		
		try{
		membervo = memberDao.selectMemberById(id);
			mv = new ModelAndView();
			mv.addObject("membervo", membervo);
			
			if(membervo != null) {
				mv.setViewName("memberResult");
			} else {
				mv.setViewName("memberSearch");
			}
		} catch(Exception e)  {
			
		}
		return mv;
	}
	
}
