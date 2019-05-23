package AOP_JSY;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class program {
  
    public static void main(String[] args) {
      
      String configLocation = "AOP_JSY/ApplicationContext.xml";
      ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
      StarcraftUnit star= context.getBean("tank",StarcraftUnit.class);
      star.appear();
      
      
      
    }
}
