package AOP_Annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* AOP_Annotation.Customer.addCustomerBefore(..))")
	public void logBefore(){
		System.out.println("logBefore() 실행 중!");
		//System.out.println("joinPoint : " + joinPoint.getSignature().getName());
		System.out.println("***********");
	}
	
	@After("execution(* AOP_Annotation.Customer.addCustomerAfter(..))")
	public void logAfter(JoinPoint joinPoint){
		System.out.println("logAfter() 실행 중!");
		System.out.println("joinPoint : " + joinPoint.getSignature().getName());
		System.out.println("***********");
	}
	
	@AfterReturning(
		pointcut = "execution(* AOP_Annotation.Customer.addCustomerReturnValue(..))",
		returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result){
		System.out.println("logAfterReturning() 실행 중!");
		System.out.println("joinPoint : " + joinPoint.getSignature().getName());
		System.out.println("메소드 결과 값 : " + result);
		System.out.println("***********");
	}
	
	@AfterThrowing(
		pointcut = "execution(* AOP_Annotation.Customer.addCustomerThrowException(..))",
		throwing = "error"
	)
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error){
		System.out.println("logAfterThrowing() 실행 중!");
		System.out.println("joinPoint : " + joinPoint.getSignature().getName());
		System.out.println("에러 메시지 : " + error);
		System.out.println("***********");
	}
	
	@Around("execution(* AOP_Annotation.Customer.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("logAround() 실행 중!");
		System.out.println("joinPoint method : " + joinPoint.getSignature().getName());
		System.out.println("joinPoint arguments" + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("주업무 시작전 보조 업무");
		joinPoint.proceed();
		System.out.println("주업무 끝난 후 보조 업무");
		
		System.out.println("***********");
	}
}
