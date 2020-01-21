package AOP_Basic_02_JAVA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandler implements InvocationHandler{
	private Object target; // 실객체의 주소값
	public LogPrintHandler(Object target) {
		System.out.println("LogPrintHanldler 보조 관심사 생성자 호출");
		this.target = target;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Invoke 함수 호출(Start)");
		System.out.println("method 함수 : " + method);
		System.out.println("args: " + Arrays.toString(args));
		
		
		// 보조관심 (공통사항)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 시작");
		
		int result = (int)method.invoke(this.target, args);
		
		//보조(공통) 업무
				sw.stop();
				log.info("[타이머 종료]");
				log.info("[TIME LOG] Method : ADD");
				log.info("[TIME LOG] Method TIME : " + sw.getTotalTimeMillis());
		return result;
	}

}
