package DI_11_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_11_Spring/DI_11.xml");
		DataSourceFactory factory = context.getBean("datasourcefactory", DataSourceFactory.class);
		System.out.println(factory.toString());
	}

}
