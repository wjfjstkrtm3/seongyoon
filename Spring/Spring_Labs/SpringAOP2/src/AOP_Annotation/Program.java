package AOP_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ASJConfig.class);
		Customer customer = (Customer)context.getBean("customerImpl");
		customer.addCustomerBefore();
		customer.addCustomerAfter();
		//customer.addCustomerReturnValue();
		//customer.addCustomerThrowException();
		//customer.addCustomerAround("안녕하세요 홍길동");

	}

}
