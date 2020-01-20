package DI_Annotation_01;
import org.springframework.beans.factory.annotation.Autowired;

import DI_Annotation_01.Recorder;

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
	public Recorder getRecorer() {
		return this.recorder;
	}
	
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
}
