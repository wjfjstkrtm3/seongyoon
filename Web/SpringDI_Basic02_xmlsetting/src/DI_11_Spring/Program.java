package DI_11_Spring;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
    //  BookClient bookclient = new BookClient();
      
    //  Properties prop = new Properties();
    //  prop.setProperty("server", "192.168.1.10");
    //  prop.setProperty("connectiontimeout", "2000");
    //  bookclient.setConfig(prop);
    //  bookclient.connect();
      
      
      ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_11_Spring/DI_11.xml");
      DataSourceFactory factory = context.getBean("dataSourceFactory", DataSourceFactory.class);
      System.out.println(factory.toString());
 
      
      
     
    }
}
