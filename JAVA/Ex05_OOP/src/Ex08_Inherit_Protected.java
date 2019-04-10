import kr.or.bit.Pclass;

// 접근자(제어자) : default, private, public, 상속관계에서 protected
// 상속관계에서만 존재
// 양면성 : default, public(상속관계에서)
// 상속관계에서 protected, super(), 오버라이드

// 상속관계에서 protected (자식클래스 안쪽 함수 안...)
class Child2 extends Pclass {
	
	void method() {
		this.p = 1000; // 상속관계에서 protected는 public
		System.out.println(this.p);
		
	}
	
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass pc = new Pclass();
		System.out.println("다른 폴더에서는 public : " + pc.j);
		
		Child2 ch = new Child2();
		ch.method();
		
		
		

	}

}
