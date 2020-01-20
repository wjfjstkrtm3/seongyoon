package DI_07_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DI_08_Spring.ArticleDao;
import DI_08_Spring.JobExecute;

public class Program {

	public static void main(String[] args) {

//		JobExecute jobexecute = new JobExecute("hong", 100L);
//		
//		ArticleDao articledao = new ArticleDao();
//		jobexecute.setDao(articledao);
//		
//		jobexecute.setData(500);
		
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_08_Spring/DI_08.xml");
	}

}
