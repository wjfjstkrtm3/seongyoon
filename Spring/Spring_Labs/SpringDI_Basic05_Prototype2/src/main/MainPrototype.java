package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import Spring.Client;



public class MainPrototype {
	public static void main(String[] args) {
			GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
			Client client = context.getBean("client2", Client.class);
			Client client2 = context.getBean("client2", Client.class);
			System.out.println(client.toString());
			System.out.println(client2.toString());
	}
}
