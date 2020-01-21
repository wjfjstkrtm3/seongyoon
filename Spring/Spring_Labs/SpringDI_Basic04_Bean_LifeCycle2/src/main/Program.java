package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;

public class Program {

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
		Client client = context.getBean("client", Client.class);
		client.send();
		context.close();
		
	}

}
