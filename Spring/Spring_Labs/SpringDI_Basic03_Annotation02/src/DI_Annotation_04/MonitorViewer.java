package DI_Annotation_04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import DI_Annotation_04.Recorder;



public class MonitorViewer {
		
	//setter 통한 자동주입
		private Recorder recorder;

		public Recorder getRecorder() {
			return recorder;
		}

		
		@Resource(name="zz")
		public void setRecorder(Recorder recorder) {
			this.recorder = recorder;
			System.out.println("setter 주입 성공 : " + recorder);
		}
	
}



