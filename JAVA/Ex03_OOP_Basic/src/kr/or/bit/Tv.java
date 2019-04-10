package kr.or.bit;
/*
요구사항 정의
Tv는 채널정보를 가지고 있다(예를 들면 1~250채널)
Tv는 브랜드 이름을 가지고 있다(예를 들면 삼성, 엘지, 등등등)
Tv는 채널 전환 기능을 가지고 있다(채널을 변경 할 수 있다 (한단계씩))
기능 2개 (++ , --)
Tv는 전원정보를 가지고 있다
TV의 전원은 On 할 수도 있고, off 할수도 있다
 */
public class Tv {
	
	public int ch; // public int ch = 1; // 채널정보는 무조건1로 하겠다
	public String brandName;
	public boolean power; // true (on) , flase(off)
	
	public void ch_up() {
		// member filed 상태 값
		ch++;
	}
	
	public void ch_down() {
		ch--;
	}
	
	public void power_on() {
		power = true; // Tv의 전원이 켜졌다
	}
	
	public void power_off() {
		power = false; // Tv의 전원이 꺼졌다
	}
	

	
	
	
	
	
}
