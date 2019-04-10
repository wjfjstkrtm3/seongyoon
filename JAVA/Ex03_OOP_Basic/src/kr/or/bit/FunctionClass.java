package kr.or.bit;
/*
함수 : 기능의 최소 단위 (method)

함수의 종류
* void (돌려주는 값이 없다) : return value 가 없다 ^^
* return Type : [8가지 기본타입] + String + 사용자 정의 클래스 + Array + Collection + Interface
* 함수가 return Type(ex public int calc() {return 100;} 있다면
* 반드시 { 실행블럭 } 안에 return 이라는 구문을 가지고 있어야한다
* parameter : [8가지 기본타입] + String + 사용자 정의 클래스 + Array + Collection + Interface 


1. void , parameter(0) public void print(String str){ System.out.println(str)}
2. void, parameter(x) public void print(){System.out.println("hello")}
3. return Type, parameter(0) public int call(int i){return i + 100;}
4. return Type, parameter(x) public int call(){return 1000;} 

함수(method) 반드시 호출(call) 되어야 실행한다 : .....
 */

public class FunctionClass {

	public void m() { // 함수의 이름은 의미 있는 단어의 조합이어야 한다 : getChnnelNumber()
		System.out.println("일반함수 : void, parameter(x)");
	
	}
	
	public void m2(int i) {
		System.out.println("parameter value : " + i);
		System.out.println("일반함수 : void, parameter(o)");
	}
	
	public int m3() { // 내가 m3 함수를 호출하면 100이라는 값을 돌려 받을 수 있다
		return 100;
	}
	
	public int m4(int data) {
		return data + 100;
	}
	

	// 접근자(한정자) : private 함수
	// 어떤 의미의 코드 : class 내부에서 사용(다른 함수를 도와줄때)
	// 다른 여러개의 함수가 가지는 공통적인 내용을 한곳의 함수에 모아서 기능제공
	// 유지보수 (수정) 용이
	private int operationMethod(int data) {
		return data * 100;
	}
	
	public int sum(int data) {
		return operationMethod(data); // 적당한 코드
	}
	
	public int sum2(int data) {
		int result = operationMethod(data);
		return result;
	}
	
	// 확장함수 (parameter 개수 여러개)
	public int sum3(int i, int j, int k) {
		return i + j + k; // 안쪽의 로직은 그대로....
	}
	
	// Quiz
	// a 와 b 둘중에 큰 값을 return 하는 함수를 만드세요
	
	int max = 0;
	public int max(int a, int b) {
		// 호출: max(100, 3) --> return 100
		// if(a>b) {
		// 	max = a;
		// } else {
		//	max = b;
		// }
		// return max;
		return (a>b) ? a :b;
		
		//int max = a > b ? a :b;
		//return max;
		
		// a>b ? a : b
	}
	
	public String concat(String s, String s2, String s3) {
		return s + "/" + s2 + "/" + s3;
		
	}
	
	// 여기까지는 쉬운 편입니다
	// 클래스 == 타입이다 (Tv t; t = new Tv(); 초기화
	
	 // public int call() {return 100;}
	 // public Tv call() { Tv t = new Tv(); return t;}
	 // public Tv call() { return new Tv(); }
	 
	
	// public void call(Tv t) { System.out.println(t.name)}
	
	// Tv tt = new Tv();
	// tt.name = "삼성";
	// call(tt);
	
	public Tv objMethod() { // Tv 타입을 갖는 주소값을 리턴한다
		Tv aa = new Tv(); // heap 객체 만들고 주소값 aa에 할당
		aa.brandName = "중저가";
		return aa;     //return new Tv();
		
	}
	public Tv objMethod2() {
	
		return new Tv(); // heap 객체 만들고 주소값 return
		
	}
	
	public void objMethod3(Tv t) {
		
		System.out.println("Tv타입 정보 : " + t);
		System.out.println("채널 정보 : " + t.ch );
		System.out.println("브랜드 이름 : " + t.brandName);
	}
	
	
	
	
	
}
