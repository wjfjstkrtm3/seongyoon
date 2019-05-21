package kr.or.bit.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/EncodingFilter")
public class EncodingFilter implements Filter {

	private String encoding;
	
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		if(request.getCharacterEncoding() == null) { 
			System.out.println("Before : " +request.getCharacterEncoding()); 
			request.setCharacterEncoding(this.encoding);
			System.out.println("after : " + request.getCharacterEncoding()); 
		}
		chain.doFilter(request, response);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.encoding = fConfig.getInitParameter("encoding");
	}

}