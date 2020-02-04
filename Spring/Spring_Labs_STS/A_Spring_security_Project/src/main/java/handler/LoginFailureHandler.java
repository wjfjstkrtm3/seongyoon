package handler;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import service.UserService;

public class LoginFailureHandler implements AuthenticationFailureHandler{

	private String loginidname;
	private String loginpwdname;
	private String errormsgname;
	private String defaultFailureUrl;
	
	@Autowired
	private UserService userSer;
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		
		
		
		
		String username = request.getParameter(loginidname);
		String password = request.getParameter(loginpwdname);
		String errormsg = exception.getMessage();
		
		if(exception instanceof BadCredentialsException) {
			System.out.println("badcredentailsException일때");
			loginFailureCount(username);
		}
		
		request.setAttribute(loginidname, username);
		request.setAttribute(loginpwdname, password);
		request.setAttribute(errormsgname, errormsg);
		request.getRequestDispatcher(defaultFailureUrl).forward(request, response);
	}

	
	protected void loginFailureCount(String username) {
		System.out.println("usermane : " + username);
		userSer.countFailure(username);
		int cnt = userSer.checkFailureCount(username);
		System.out.println("cnt : " + cnt);
		if(cnt==3) {
			userSer.disabledUsername(username);
		}
	}
	public String getLoginidname() {
		return loginidname;
	}


	public void setLoginidname(String loginidname) {
		this.loginidname = loginidname;
	}


	public String getLoginpwdname() {
		return loginpwdname;
	}


	public void setLoginpwdname(String loginpwdname) {
		this.loginpwdname = loginpwdname;
	}

	public String getErrormsgname() {
		return errormsgname;
	}

	public void setErrormsgname(String errormsgname) {
		this.errormsgname = errormsgname;
	}

	public String getDefaultFailureUrl() {
		return defaultFailureUrl;
	}


	public void setDefaultFailureUrl(String defaultFailureUrl) {
		this.defaultFailureUrl = defaultFailureUrl;
	}

}
