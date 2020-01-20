package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		
		System.out.println("before : mybean 객체");
		MyBean bean = context.getBean("mybean", MyBean.class);
		System.out.println("after : mybean 객체 " + bean);
		
		System.out.println("before : mybean 객체");
		MyBean bean2 = context.getBean("mybean", MyBean.class);
		System.out.println("after : mybean 객체 " + bean2);
		
		System.out.println("before : mybean(name) 객체");
		MyBean bean3 = context.getBean("mybean2", MyBean.class);
		System.out.println("after : mybean(name) 객체 " + bean3);
		
		Singleton single = context.getBean("single", Singleton.class);
		System.out.println("singleton 객체 : " + single);
		
		Singleton single2 = context.getBean("single", Singleton.class);
		System.out.println("singleton 객체 : " + single2);
		
	}

}





