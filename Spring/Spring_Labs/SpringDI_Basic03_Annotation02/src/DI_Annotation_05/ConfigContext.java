package DI_Annotation_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration // 이 클래스가 스프링 설정으로 사용됨을 인정
public class ConfigContext {
		// <bean id="zz" class="DI_Annotation_05.User></bean>
	@Bean
	public User user() {
		return new User();
	}
	@Bean
	public User2 user2() {
		return new User2();
	}
}
