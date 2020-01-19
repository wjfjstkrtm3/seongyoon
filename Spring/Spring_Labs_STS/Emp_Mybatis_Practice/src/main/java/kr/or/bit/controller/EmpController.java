package kr.or.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import kr.or.bit.model.EmpDao;
import kr.or.bit.model.EmpDto;

@Controller
public class EmpController {
	
	@Autowired
	private SqlSession sqlsession;
	
	
	private View jsonview;
	
	@RequestMapping("/listemp.htm")
	public String Emplist(Model model) {
		EmpDao empdao = sqlsession.getMapper(EmpDao.class);
		List<EmpDto> list = empdao.selectAll();
		
		System.out.println("list" + list);
		
		model.addAttribute("list", list);
		return "listemp";
	}
	
	@RequestMapping("/listone.htm")
	public String Empone(Model model) {
		EmpDao empdao = sqlsession.getMapper(EmpDao.class);
		
		EmpDto one = empdao.selectOne();
		System.out.println("one : " + one);
		
		
		model.addAttribute("one", one);
		
		return "listone";
	}
	
	@RequestMapping(value = "listone.htm", method = RequestMethod.POST)
	public String Empsearch(Model model, int empno) {
		EmpDao empdao = sqlsession.getMapper(EmpDao.class);
		System.out.println("empno : " + empno);
		EmpDto sc = empdao.selectSearch(empno);
		model.addAttribute("sc", sc);
		return "listone";
	}
	

	
	
}
