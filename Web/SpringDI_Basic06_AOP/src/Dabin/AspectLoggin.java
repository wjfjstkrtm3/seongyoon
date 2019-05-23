package Dabin;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectLoggin {
	@Around("execution(public * Dabin.*.Buy*(..))")
	public void loggin(ProceedingJoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		try {
			System.out.println(methodName);
			joinPoint.proceed();
			System.out.println(methodName);
		}catch(Throwable e) {
			System.out.println("예외발생");
		}
		
	}
}
