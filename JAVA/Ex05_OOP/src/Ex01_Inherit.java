/*
 객체지향언어 (OOP) 3대 특징 (Object Oriented Programming)
 상속
 다형성
 캡슐화(은닉화) : private

 1. 상속
 java : Child extends Base
 c# > Child > Base
 
 2. 상속특징
 - 다중상속은 불가 (복잡성 ...)
 - 단일상속이 원칙 (계층적 상속을 사용해서 다중상속을 구현)
 - 다중상속을 지원 (유일하게 Interface)
 
 3. 의미
 진정한 의미 : [재사용성] >> 반복적인 코드 ... 공통코드 ... 부모
 단점 : 초기 설계 비용 ..
 
 재사용성 >> 설계시 >> 비용(시간, 공통분모, 추상화)
 
 Memory 로딩 ... 모습 ... 누가 먼저 Memory에 올라갔을까?
 
  */
class GrandFather {
	public int gmoney = 5000;
	private int pmoney = 50000; // 내가 먹고 죽을거야(무덤까지)
								// private는 상속관계에서 보이지않는다
	// 1. 참조변수도 접근안되고
	// 2. 상속관계에서도 접근안됨
	// 3. 특정 자원을 상속관계에서 보이고 싶지 않을때 private을 쓰지만, 잘쓰지 않는다
	GrandFather() {
		System.out.println("할배 생성자");
	}
}

class Father extends GrandFather {
	public int fmoney = 1000;
	
	Father() {
		System.out.println("아빠 생성자");
	}
}

class Child extends Father {
	public int cmoney = 100;
	Child() {
		System.out.println("나 생성자");
	}
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.gmoney); // 할아버지 돈 내돈
		System.out.println(c.fmoney); // 아버지 돈 내돈
		System.out.println(c.cmoney); // 내 돈도 내돈
//		System.out.println(c.pmoney); // 접근불가
		
		
		
		

	}

}
