package DI_Annotation_02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import DI_Annotation_02.Recorder;

public class MonitorViewer {
		/*
	private Recorder recorder;
	
	public Recorder getRecorder() {
		return this.recorder;
	}
	
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	*/
	
	
	private Recorder recorder;
	public Recorder getRecorder() {
		return this.recorder;
	}
	
	@Autowired
	@Qualifier("corder1")
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 : " + recorder);
	}
	
	
	@Autowired
	@Qualifier("corder2")
	public void Gmethod(Recorder rec) {
		System.out.println("Gmethod(rec) : " + rec);
	}
}
