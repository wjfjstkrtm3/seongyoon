/*
추상 클래스와 인터페이스의 공통점
1. 스스로 객체 생성 불가능 (new 연산자 사용 불가)
2. 상속, 구현을 통해서만 사용가능 (메모리에 적개 가능)
3. 재정의를 통한 강제 구현이 목적

추상 클래스와 인터페이스의 다른점
1. 인터페이스는 유일하게 다중 상속이 가능
	Ex) interface Ia, interface Ib
	class Child implements Ia, Ib, Ic
2. 추상클래스는 단일상속이 원칙
3. 추상클래스(완성된 코드 + 미완성된 코드)
4. 인터페이스는 상수를 제외한 나머지는 미완성 코드(추상 자원)
 
* 인터페이스간에는 상속이 가능(다중)
  interface Ia extends Ib, Ic, Id
* 하나의 클래스는 여러개의 인터페이스를 구현 가능
  class Child (extends Object) implements Ia, Ib, Ic
  
  ****************************************************************
  개발자 입장
  
  1. 인터페이스를 [다형성] 입장에서 접근한다 (인터페이스는 부모 타입이다)
  2. 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능 (부모가 동일)
  3. 인터페이스는 (~able) : 날 수 있는, 수리 할 수 있는 (설계)
  4. 객체간의 연결 고리 (객체간의 소통)

 */

interface Irepairable {}; // I ~ , ~ able ( ~ 할 수 있는), 수리 할 수 있는

class Unit2 extends Object {
	int hitpoint; // 기본 에너지
	final int MAX_HP;

	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// 지상 유닛
class GroundUnit extends Unit2 {

	GroundUnit(int hp) {
		super(hp);
	}
}

// 공중 유닛

class AirUnit extends Unit2 {

	AirUnit(int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit implements Irepairable {

	Tank2() {
		super(100);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}

}

class Marine2 extends GroundUnit {

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}

}

class CommandCenter implements Irepairable {

	@Override
	public String toString() {
		return "CommandCenter";
	}

}

class Scv extends GroundUnit implements Irepairable {

	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// Scv 특수화, 구체화, 실체화
	// 수리 할 수 있다 (repair)

//	void repair(Tank2 tank) {
//		if(tank.hitpoint != tank.MAX_HP) {
//			tank.hitpoint += 5;
//		}
//		
//	}
//	
//	void repair(Scv scv) {
//		if(scv.hitpoint != scv.MAX_HP) {
//			scv.hitpoint += 5;
//		}
//	}

	// 답안) 다형성 ...
	// scv는 unit의 개수만큼 repair를 가지고 있어야 한다
	// unit 추가시 repair 함수 추가
	// 고민은 : 하나의 함수로 다른 모든 unit을 수리 할 수 없을까?
	// 1. 제시 : void repair(GroundUnit unit) ... Marine2 (repair (x))

	// 2. 제시 : void repair(Irepairable repairunit)
	// Irepairalbe 부모타입 ---> 자식 타입 Scv, CommandCenter, Tank2
	// 고민 : repairunit. 참조변수가 접근 할 수 있는 자원이 없어요 ....

	void repair(Irepairable repairunit) {
		// 1. Tank2, Scv, CommandCenter
		// if(scv.hitpoint != scv.MAX_HP) {scv.hitpoint+=5};

		// 부모 타입 변수 = 자식 타입 주소
		// Tv t = new Tv();
		// Product product = (Product)t; // casting 생략

		// Tv t2 = (Tv)product; // 명시적인 캐스팅

		/*
		 * Irepairable | Object | Unit2 | GroundUnit | Tank2
		 * 
		 */

		// 들어오는 객체의 타입을 비교 판단
		if (repairunit instanceof Unit2) {
			// downcasting
			Unit2 unit = (Unit2) repairunit;
			// unit.hitpoint
			// unit.MAX_UP

			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; // 체력회복
			}
			// CommandCenter 객체의 주소가 parameter로 올수 있지만 repair의 대상이 아니다
			// void repair(Irepairable repairunit)

		} else {
			System.out.println("unit 아니에요 ....다른 repair");
			// 필요한 코드 구현
		}
	}

}

public class Ex03_Interface {

	public static void main(String[] args) {

		Tank2 tank = new Tank2();
		Marine marine = new Marine();
		Scv scv = new Scv();

		// 전투
		tank.hitpoint -= 20;
		System.out.println("탱크 전투 : " + tank.hitpoint);
		System.out.println("나 파손 당했어 수리해줘");
		scv.repair(tank);
		System.out.println("수리완료" + tank.hitpoint);

		// scv.repair(marine); 마린 자체가 올 수 없다
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
