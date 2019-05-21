package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
  
    public static void main(String[] args) {
        // 영문
           // MessageBean_en messageBean_en = new MessageBean_en();
           // messageBean_en.sayHello("hong");
            
        // 한글
           // MessageBean_kr messageBean_kr = new MessageBean_kr();
           // messageBean_kr.sayHello("hong"); 
      
        // interface 다형성 (하나의 참조 변수가 여러개의 주소를 가질 수 있다)
           // MessageBean messagebean = new MessageBean_kr(); // 객체의 생성과 조립은 컨테이너에게 맡긴다
           // messagebean.sayHello("hong");
      // xml 은 . 접근자, java파일에서는 / 로 
      // 컨테이너를 구성할거고, 객체와 DI는 xml를 읽어서 처리하겠다
        ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
        // 필요다하면 컨테이너(context) 안에서 객체를 반환받아서 사용
        MessageBean message = context.getBean("message", MessageBean.class);
        message.sayHello("hong");
           
    }
}
