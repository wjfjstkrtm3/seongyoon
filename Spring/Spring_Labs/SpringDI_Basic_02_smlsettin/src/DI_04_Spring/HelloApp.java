package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		/*
		 * MessageBeanImpl messagebean = new MessageBeanImpl("hong");
		 * messagebean.setGreeting("hello");
		 * 
		 * messagebean.sayHello();
		 */
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml");
		MessageBeanImpl bean = context.getBean("m2", MessageBeanImpl.class);
		bean.sayHello();
		
		
		
	}

}





