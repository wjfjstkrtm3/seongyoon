package AOP_Basic_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class program {

	public static void main(String[] args) {

		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:AOP_Basic_03/ApplicationContext.xml");
		Calc calc = context.getBean("proxy", Calc.class);
		int result = calc.ADD(10000, 50000);
		System.out.println("결과 : " + result);
	}

}