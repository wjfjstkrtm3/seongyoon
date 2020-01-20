package DI_09_Spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {

//		ProtocolHandlerFactory f = new ProtocolHandlerFactory();
//		RestHandler rest = new RestHandler();
//		RssHandler rss = new RssHandler();
//		Map<String, ProtocolHandler> map = new HashMap();
//		map.put("rest", rest);
//		map.put("rss", rss);
//		
//		f.setHandlers(map);
			
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_09_Spring/DI_09.xml");
	}

}
