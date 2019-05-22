package AOP_Basic_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.StopWatch;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/*
보조관심사 (공통관심) 
invoke : 하나의 함수가 여러개의 함수를 대리 처리

*/
public class LogPrintAroundAdvice implements MethodInterceptor{
    

  @Override
  public Object invoke(MethodInvocation method) throws Throwable {
    System.out.println("Around Advice Invoke Start");
    System.out.println("method : " + method);
    
    // 보조(공통) 업무
    Log log = LogFactory.getLog(this.getClass());
    StopWatch sw = new StopWatch();
    sw.start();
    log.info("타이머 시작");
    
    
    // 주업무(실객체의 함수 호출)
    Object result = method.proceed();
    
    // 보조(공통) 업무
    sw.stop();
    log.info("[타이머 종료]");
    log.info("[TIME LOG] Method : ADD");
    log.info("[TIME LOG] Method TIME : " + sw.getTotalTimeMillis());
    return result;
  }


    
}
