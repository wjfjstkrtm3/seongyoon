package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Cal {
		public int Add(int x, int y) {
			Log log = LogFactory.getLog(this.getClass());
			StopWatch sw = new StopWatch();
			sw.start();
			log.info("타이머 시작");
			
			int result = x + y;
			sw.stop();
			log.info("[타이머 종료]");
			log.info("[TIME LOG] Method : ADD");
			log.info("[TIME LOG] Method TIME : " + sw.getTotalTimeMillis());
			return result;
		}
		
		public int Mul(int x , int y) {
			Log log = LogFactory.getLog(this.getClass());
			//System.currentTimeMillis()
			StopWatch sw = new StopWatch();
			sw.start();
			log.info("타이머 시작");
			
			int result = x * y; //주관심
			
			sw.stop();
			log.info("[타이머 종료]");
			log.info("[TIME LOG] Method : ADD");
			log.info("[TIME LOG] Method TIME : " + sw.getTotalTimeMillis());
			return result;
		}
}
