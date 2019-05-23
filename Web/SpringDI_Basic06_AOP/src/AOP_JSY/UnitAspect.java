package AOP_JSY;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect // 프록시 사용
public class UnitAspect {
  @Around("execution(public * AOP_JSY.*.Buy*(..))")
    public void unit(ProceedingJoinPoint joinPoint) {
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
