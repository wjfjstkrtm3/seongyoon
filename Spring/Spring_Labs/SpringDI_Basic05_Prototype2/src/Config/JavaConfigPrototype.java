package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Spring.Client;

@Configuration
public class JavaConfigPrototype {
	/*	
	  <bean id="client" class="Spring.Client" scope="prototype">
		<property name="host" value="webserver"></property>
		</bean>
	*/
	@Bean
	@Scope("prototype")
	public Client client() {
		Client client = new Client();
		client.setHost("webserver");
		return client;
	}
	
	
}
