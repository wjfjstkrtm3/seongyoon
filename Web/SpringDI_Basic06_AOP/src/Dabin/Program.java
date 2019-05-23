package Dabin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		String configLocation = "Dabin/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		Product product = context.getBean("tv",Product.class);
		product.Buy();
	}

}
