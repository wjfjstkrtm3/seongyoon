package DI_Annotation_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
ConfigContext 자바파일로 xml 설정 파일을 대체하겠다
ConfigContext 자바 가지고 객체의 생성과 주입작업을 하겠다

@Configuration (설정파일)
@Bean (객체 생성) 함수 기반

xml 문서라면
<bean id="user" class="DI_Annotation_05.User"></bean>
<bean id="user2" class="DI_Annotation_05.User2"></bean>

위 코드를 자바파일에서는 함수로 만들어서 객체를 리턴

 */
@Configuration
public class ConfigContext {
    
    @Bean
    public User user() { // 함수 이름 == id
      return new User();
      
      // <bean id="user" class="DI_Annotation_05.User"></bean>
    }
    
    @Bean
    public User2 user2() {
      return new User2();
      
      // <bean id="user2" class="DI_Annotation_05.User2"></bean>
    }
    
}
