package AOP_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ASJConfig {

	@Bean
	public CustomerImpl customerImpl(){
		return new CustomerImpl();
	}
	
	@Bean
	public LogginAspect logginAspect(){
		return new LogginAspect();
	}
}
