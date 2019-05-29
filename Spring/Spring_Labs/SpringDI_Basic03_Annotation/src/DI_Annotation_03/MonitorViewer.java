package DI_Annotation_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class MonitorViewer {
		
	//setter 통한 자동주입
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	//@Autowired(required=true) 기본설정 (무조건:injection)
	@Autowired(required=false) //타입기반 (IOC 컨테이너 안에  Recorder 타입을 가지는 객체가 있으면 자동 주소값 주입)
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 :" + recorder);
	}
	
	
}



