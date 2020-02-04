package handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import service.UserService;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	private String loginidname;
	private String defaultUrl;
	private RequestCache requestCache = new HttpSessionRequestCache();
	private RedirectStrategy RedirectStrategy = new DefaultRedirectStrategy();
	
	@Autowired
	private UserService userSer;
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
	}
	
	
	protected void resultRedirectStrategy(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {

		SavedRequest savedRequest = requestCache.getRequest(request, response);
		
		if(savedRequest != null) {
			System.out.println("권한이 있는 페이지로 이동할때");
			String targetUrl = savedRequest.getRedirectUrl();
			System.out.println("targetUrl : " + targetUrl);
			RedirectStrategy.sendRedirect(request, response, targetUrl);
		} else {
			System.out.println("내가 로그인버튼 눌렀을때");
			System.out.println("defaultUrl : " + defaultUrl);
			RedirectStrategy.sendRedirect(request, response, defaultUrl);
		}
		
		clearAuthenticationAttributes(request);
		
		String username = request.getParameter(loginidname);
		System.out.println("username : " + username);
		userSer.resetFailureCnt(username);
		
	}
	
	protected void clearAuthenticationAttributes(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session==null) return;
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}
	public String getLoginidname() {
		return loginidname;
	}

	public void setLoginidname(String loginidname) {
		this.loginidname = loginidname;
	}

	public String getDefaultUrl() {
		return defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}


}
