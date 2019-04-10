// 연습용 (Ex04_Variable_Scope.java 파일 안에다)

class Variable {
	int iv; // 앞에 default 생략
	/*
	 1. iv -> member field (instance variable)
	 2. 목적 : 정보를 담을려고 만든다 (고유, 상태, 부품(참조))
	 3. 특징 : 초기값을 (default) 가지고 있다 (정수>0, 실수>0.0, boolean>false
	 		 초기화를 하지 않는다. (생성되는 객체마다 다른 값을 가지게 하기위해서)
	 4. 생성시점(memory에 로딩되는 시점) : new 라는 연산자를 통해서 heap영역에 객체만들때
	 */
	
	static int cv;
	/*
	1. class variable, static variable (공유자원)
	2. 목적 : 정보를 담으려고 만든다 >> [생성되는 모든 객체가 공유하는 자원] >> 객체 간 공유자원
	3. 특징 : 접근방법 >> 클래스이름.static자원(variable.cv) >> 객체가 만들어지지 않아도 접근 가능하다 (Math.random())
	4. 생성시점 : 프로그램이 실행될때(java hello) class loader system 에 의해서 [클래스 정보]를 읽고 (class area, method area)에 정보를 올리고 나서
	 		   올려진 클래스안에 static 자원을 가지고 있다면 static 자원도 같이 memory road 합니다
	 		   >> static 객체 생성 이전에 memory에 올라가는 자원
	 		   
	 		   
	 		   
	 		   
	 
	 */
	
	void method() {
		int lv = 0; 
		// local variable (지역변수)
		// 특징 : 지역변수는 사용하기 전 반드시 초기화
		// 생성시점 : 함수가 호출되면 만들어지고 함수가 끝나면 소멸 (stack 영역에 만들어진다)
			
	}
}
	


public class Ex04_Variable_Scope {

	public static void main(String[] args) {
		
		/*
		Variable.cv = 100; // static 변수(공유)
		System.out.println("Varaible.cv : " + Variable.cv);
		Variable v = new Variable();
		v.iv = 200;
		v.cv = 500;
		// static 변수는 new 연산자로 객체를 만들고 접근을해도 되고,
		// 클래스이름. 으로 접근해도된다
		
		System.out.println("Varaible.cv : " + Variable.cv);
		*/
		
		System.out.println("Varaible.cv : " + Variable.cv);
		// 객체간 공유자원
		Variable v = new Variable();
		System.out.println(v.cv);
		
		Variable v2 = new Variable();
		System.out.println(v2.cv);
		
		
		

	}

}
