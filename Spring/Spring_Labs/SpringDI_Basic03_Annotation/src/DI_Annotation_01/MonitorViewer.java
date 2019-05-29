package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;



public class MonitorViewer {
	/*
	1단계 : xml 설정파일로 DI 작업
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	*/
	
	//2단계 : Annotation 기반 DI 작업(injection : 생성자,setter 주입)
	//추가적으로 member field 도 injection 가능
	//@Autowired : IOC 컨테이너 안에 Recorder 타입을 가진 객체가 있다면
	//자동으로 그 객체의 주소를 받겠다
	//Recorder r = new Recorder();  
	//recorder = r;
	//<property name="recorder">
	//	<ref bean="recorder" />
	//</property>
	/*
	@Autowired
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	*/
	
	//setter 통한 자동주입
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	@Autowired //타입기반 (IOC 컨테이너 안에  Recorder 타입을 가지는 객체가 있으면 자동 주소값 주입)
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
}



