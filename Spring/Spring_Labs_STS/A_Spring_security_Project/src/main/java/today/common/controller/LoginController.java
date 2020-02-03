package today.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/secu/loginPage")
	public String page() throws Exception {
		return "/secu/loginPage";
	}
	
	@RequestMapping(value="/access_denied_page") 
		public String accessDeniedPage() {
			return "/access_denied_page";
		}
	
}
