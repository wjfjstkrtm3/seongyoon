package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.JavaConfigPrototype;
import Spring.Client;

public class MainPrototypeConfig {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigPrototype.class);
		Client client = context.getBean("client", Client.class);
		Client client2 = context.getBean("client", Client.class);
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
	}
}
