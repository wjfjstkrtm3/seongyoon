class Tv {
	 boolean power;
	 int ch;
	 
	 void power() {
		 this.power = !this.power;
	 }
	 
	 void chUp() {
		 this.ch++;
	 }
	 
	 void chDown() {
		 this.ch--;
	 }
}

class Vcr { // 비디오 플레이어
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("재생하기");
	}
	
	void stop() {
		System.out.println("정지");
	}
	
	void rew() {

	}
	
	void ff() {
		
	}
}
	// 설계도 : TV, VCR를 가지고 있다
	// Vcr 기능과 Tv기능을 다 갖춘 설계도를 작성해 주세요
	// TvVcr 설계도 제품을 만들고 싶어요
	
	// 설계도 재사용...
	// class TvVcr extends Tv, Vcr {} (X : 다중상속)
	// Tv extends Vcr
	// TvVcr extends Tv (계층적 상속)
	
	
	// 전제조건 : 상속은 한번만 하세요
	// 상속, 포함
	// 고민 : TvVcr 을 만들때 어떤 놈을 상속하고, 어떤 놈을 포함하는지 ...
	
	// 주 기능(Tv), 보조 기능(Vcr)
	// 비중이 높은 클래스를 상속해라

class TvVcr extends Tv{
	Vcr vcr;
	
	TvVcr() {
		this.vcr = new Vcr();
	}
	
}







public class Ex03_Inherit_Single {

	public static void main(String[] args) {
	
		TvVcr t = new TvVcr();
		t.power(); // 켜짐
		System.out.println("Tv 전원상태 : " + t.power);
		
		t.chUp();
		t.chUp();
		System.out.println("Tv 채널정보 : " + t.ch);
		
		// 비디오 전원 ...
		
		t.vcr.power();  // 켜짐
		System.out.println(t.vcr.power);
		
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power(); // 꺼짐
		
		t.power(); // 꺼짐
		
		System.out.println("Tv 전원 : " + t.power);
		System.out.println("Video 전원 : " + t.vcr.power);
		
		

	}

}
