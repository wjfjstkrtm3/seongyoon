/*
스타크래프트

유닛(unit)

unit 공통기능 (이동좌표, 이동, 멈춘다)
unit 이동방법 다르다 (unit ....)

팀장 : unit 클래스 만들어서 팀원 배포 .... 각각의 unit 만들어 ...

 */

abstract class Unit {
	int x, y;
	
	void stop() {
		System.out.println("Unit Stop");
	}

	// 모든 유닛은 이동을 가지고 있지만, 유닛마다 방법이 다르다
	
	abstract void move(int x, int y); // 날아간다, 걸어간다 
	// 추상함수(자원) -> 구체화, 특수화, 실체화 ...

}

class Tank extends Unit {

	
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동 : " + this.x + "," + this.y);
		
	}
	
	// Tank 구체화, 특수화  ..
	void changeMode() {
		System.out.println("탱크 변환 모드 실행");
	}
	
	// 필요하다면 .... 구현
	
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 걸어서 이동 : " + this.x + "," + this.y);
		
	}
	
	void stimpack() {
		System.out.println("스팀팩 기능사용");
	}
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip 공중 이동 : " + this.x + "," + this.y);
		
	}
	
	void load() {
		System.out.println("Unit load");
	}
	
	void unload() {
		System.out.println("Unit unload");
	}
	
}



public class Ex02_abstract_class {

	public static void main(String[] args) {
			Tank t = new Tank();
			t.move(100, 200);
			t.stop();
			t.changeMode();
			
			Marine m = new Marine();
			m.move(300, 200);
			m.stop();
			m.stimpack();
			
			
		
			// 1. Quiz 탱크 3대를 만들고 [같은 좌표]
			// 땡크를 배열로 만들어라
			Tank[] tankarr = {new Tank(), new Tank(), new Tank()};
//			for(Tank ta : tankarr) {
//				ta.move(10, 200);
//			}
			
			for(int i = 0; i<tankarr.length; i++) {
				tankarr[i].move(10, 200);
				
			}
			
			// 2. Quiz
			// Tank, Marie, DropShip 3개의 unit을 같은 좌표로 이동 시키세요
			// void Buy(Product p)
			// cart >> Product[] cart...
			
			Unit[] unitarr = {new Tank(), new Marine(), new Dropship()};
			for(Unit u : unitarr) {
				u.move(111, 222);
			}
			
			// Today Point
			// 서로 다른 것들을 같은 부모로 만들어서 ....
			// 다형성
		
	}

}
