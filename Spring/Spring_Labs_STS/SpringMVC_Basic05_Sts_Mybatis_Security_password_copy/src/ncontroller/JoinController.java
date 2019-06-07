package ncontroller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

import dao.MemberDao;
import service.JoinService;
import vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinController {

/*	@Autowired
	private MemberDao memberdao;*/

	
	
	@Autowired
	private JoinService service;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping(value="join.htm",method=RequestMethod.GET)
	public String join() {
		//return "join.jsp";
		return "joinus.join"; //폴더명.파일명
	}
	
	@RequestMapping(value="join.htm",method=RequestMethod.POST)
	public String join(Member member) throws ClassNotFoundException, SQLException {
		System.out.println(member.toString());
		
		int result = 0;
		String viewpage="";
		
		member.setPwd(this.bCryptPasswordEncoder.encode(member.getPwd()));
		result = service.insertMember(member);
		
		if(result > 0) {
			System.out.println("가입성공");
			viewpage = "redirect:/index.htm";
		}else {
			System.out.println("가입실패");
			viewpage = "join.htm";
		}
		
		return viewpage; //주의 (website/index.htm
		
	}
	
	//로그인 페이지
	@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public String login() {
		//return "join.jsp";
		return "joinus.login"; //폴더명.파일명
	}
	
	
	/*
	@RequestMapping(value="idcheck.htm")
	public View idCheck(String userid , ModelMap map){
		System.out.println("userid:" +userid);
		String data="";
		if(userid.equals("kglim")){
			data ="success";
		}else{
			data = "fail";
		}
		map.addAttribute("userid", data);
		return jsonview;
	}
	*/
}
