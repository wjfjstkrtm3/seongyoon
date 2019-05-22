package DI_Annotation_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class MonitorViewer {
	
	//setter 통한 자동주입
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	@Autowired
	@Qualifier("corder1") // <qualifier value="corder1"></qualifier>
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 : " + recorder);
	}
	
	// 일반함수
	@Autowired
	@Qualifier("corder2") // <qualifier value="corder2"></qualifier>
	public void Gmethod(Recorder rec) {
	  System.out.println("Gmethod(rec) : " + rec);
	}
	
}



