class Parent {
	
	int x = 100;
	
	void pmethod() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent {
	int y = 200;
	int x = 2000; // C# 재정의 : 변수 무시하기
	
	void parent_x() {
		System.out.println(super.x);
	}
	
	@Override
	void pmethod() {
		System.out.println("부모 함수 재정의");
	}
	
	void parent_method() {
		super.pmethod();
	}
}



public class Ex14_Inherit_Override {

	public static void main(String[] args) {
		
		Child3 ch = new Child3();
		Parent pa = ch; // 다형성
						// 부모타입의 참조변수는 자식 타입의 주소값을 받을 수 있다
						// 받더라도 부모자원만 사용 할 수 있다
		// pa.y 접근 ...(x) 자식꺼니까
		System.out.println("ch.x : " + ch.x);
		ch.parent_x();
		ch.pmethod();
		pa.pmethod();
		ch.parent_method();
		
	}

}
