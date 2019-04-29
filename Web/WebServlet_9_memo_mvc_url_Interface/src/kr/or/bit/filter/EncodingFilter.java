package kr.or.bit.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


@WebFilter(
		urlPatterns = { "/*" }, 
		initParams = { 
				@WebInitParam(name = "encoding", value = "UTF-8", description = "한글처리")
		})
public class EncodingFilter implements Filter {
		// 지역변수 만들기
		private String encoding;
    
    public EncodingFilter() {
       
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		// request (요청이 들어왔을때 구현되는 보조(공통) 관심 코드)
				if(request.getCharacterEncoding() == null) {					
					request.setCharacterEncoding(this.encoding);
				}
				chain.doFilter(request, response); // ***************************************8
				
				// response(응답할때 처리되는 코드)
				// System.out.println("response 응답 처리 ^^");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		this.encoding = fConfig.getInitParameter("encoding");
		System.out.println("Filter init : " + this.encoding);
	}

}
