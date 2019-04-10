// 변수 <-> 상수
// 상수 : 한번 값이 정해지면 변경이 불가...
// 시스템에서 한번 값이 정해지면 변경 되지 말아야 될것 : 시스템 버전 번호, 
// 일반상식선에 값이 정해지면 변경 되지 말아야 될것 : 고유값 : 주민번호, PI

// 상수 관용적으로 대문자
// Java : final int NUM = 100;
// C# : const int NUM = 100;

// final 키워드
// 클래스 앞에 : final class Car{} >> 상속불가 (extends 불가)
// 함수 앞에 : public final void print() {} >> 상속관계에서 재정의하지마 (거의 쓰지않음)
// 재정의 하지않게 하려면 private을 붙이면 되므로 쓸 이유가 없음

class Vcard {
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		// 시스템 상수 (static final double PI = 3.14159...
		
		System.out.println(Math.PI);
	}
}

// 질문 : Vcard 타입으로 만드는 모든 객체는 결국 같은 상수값을 가진다
// 객체마다 다른 상수 값을 갖고 싶어요 ??
// 상수 값이 한번 설정되면 변경 x....

class Vcard2 {
	final String KIND; // 객체 만들고 초기화 안하면 어떻하지 ...
	final int NUM;
	
//	쓰나마나임
//	Vcard2() {
//		this.KIND = "heart";
//		this.NUM = 10;
//		
//	}
	
//	Vcard2() {
//		
//	}
	
	
	// 강제적으로 초기화를 할 수 있는 코드를 제공 (생성자)
	// 객체마다 다른 값을 가지게 할 수 있다
	Vcard2(String kind, int num) {
		this.KIND = kind;
		this.NUM = num;
	}
	
}


public class Ex07_Final {
	
	public static void main(String[] args) {
		
		Vcard v = new Vcard();
		// v.KIND = "200"; 안되요
		System.out.println(v.KIND);
		v.method();
		
		// POINT : 객체마다 다른 상수값을 부여할 수 있습니다 ^^
		Vcard2 v2 = new Vcard2("space", 1);
		System.out.println(v2.KIND + "/" + v2.NUM);
		
		Vcard2 v3 = new Vcard2("heart", 10);
		System.out.println(v2.KIND + "/" + v2.NUM);
		
		
		
		
		
	}
}
