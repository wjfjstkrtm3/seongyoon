/*
추상 클래스 (설계 입장...)
미완성 설계도
미완성 클래스(완성된 코드 + 미완성 코드가 결합된 형태)
-- 미완성 코드 : 미완성 함수 (함수가 {실행 블럭}을 가지고 있지 않다)
-- Ex) public void print();     --> {} 없어요
미완성 클래스 : new를 통해서 객체 생성이 불가(미완성) ...
...
상속관계  : 오버라이드, super(), 추상 클래스
미완성 설계도는 최소한 하나의 미완성 함수를 포함하고 있기떄문에 new를 사용불가
1. 추상클래스는 스스로 객체 생성 불가 (new 사용 불가)
2. 추상클래스는 결국 완성된 클래스로 만들어서 사용 -> 상속을 통해서 ...
3. 미완성 자원(추상 함수) 완성 해라(구현) -> 재정의 -> override

WHY : 추상 클래스를 왜 만들어 쓸까?
	: 상속관계에서 추상함수를 강제적 구현을 목적 (설계자의 입장에서)
	: 일반함수를 그냥 만들어놓으면 까먹고 구현을 하지않을 수도있으니까, 추상클래스로 만들어서 너내 4명이 각각 구현했으면 좋겠다라는 설계자의 입장에서 만든것
	


 */
abstract class Abclass {
	int pos;
	void run() {
		pos++;
	}
	// 위 코드는 완성된 코드 입니다
	
	// 추상 함수(추상 자원)
	abstract void stop(); // {} 실행블럭이 없어요
	// 다른 클래스가 상속에서 사용하지않으면 종이 쪼가리에 지나지않는다
}

class Child extends Abclass {

	@Override
	void stop() { // stop 이라는 함수를 재정의
		this.pos = 0;
		System.out.println("stop : " + this.pos);
		
	}
	
}





public class Ex01_abstract_class {

	public static void main(String[] args) {
		// Abclass ab = new Abclass(); 불가
		Child ch = new Child();
		ch.run();
		ch.stop();
		
		
		Abclass ab = ch; // 다형성
		ab.run();
		ab.run();
		System.out.println("현재 pos : " + ab.pos);
		ab.stop(); // 재정의가 자식쪽에 있는 stop 함수 호출
		
	}

}
