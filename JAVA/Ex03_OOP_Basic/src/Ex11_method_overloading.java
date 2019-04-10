/*
객체 지향 언어 특징
상속, 캡슐화, 다형성

캡슐화 (은닉화) -> private


[method overloading]
[하나의 이름]으로 [여러가지 기능]을 하는 함수
하나의 클래스에 같은 이름의 메소드를 여러개 선언하는것 
사용 : System.out.println() 대표적인 예
특징 : 오버로딩은 성능향상에 도움을 주지 않는다
	  why? : 편하게 살려고(사용) >> 개발자
	  설계시 어떤 점을 고려 : 함수의 활용이 많은 경우
 
문법 : 함수의 이름은 같고 parameter의 개수와 타입을 달리하는 방법
1. 함수의 이름은 같아야 한다
2. [parameter] 개수와 또는 [Type]은 달라야 한다
3. return Type 은 overloading의 판단기준이 아니다
4. parameter 순서가 다름을 인정 ...
*/


class Human {
	
	String name;
	int age;
	

}

class OverTest {
	int add(int i) {
		return 100 + i;
	}
	
	String add(String s) {
		return "hello" +s;
		
	}
	
	// void add(int k) {}// parameter type 충돌
	
	int add(int i, int j) { // 개수가 다르므로 오버로딩으로 인정
		return i + j;
	}
	
	void add(int i, String s) {
		System.out.println("오버로딩");
	}
	
	void add(String s, int i) { // parameter의 순서가 다르므로 오버로딩으로 인정
		System.out.println("순서 인정 : overloading ");
	}
	
	void add(Human h) { // class == Type
		h.name = "홍길동";
		h.age = 100;
		System.out.println(h);
		

	}
	
	
	
	
	
	
	
	// 배열(Array) 배웠으니
	// 초초중급 ....
	// int[] source = {1, 2, 3, 4, 5};
	int[] add(int[] param) { // parameter로 int 배열의 주소값을 받겠다
		
		int[] target = new int[param.length];
		for(int i = 0; i<param.length; i++) {
			target[i] = param[i]+1;
		}
		
		return target; // int 타입의 배열의 주소값을 return
	
	}
	
	
	int[] add(int[] so, int[] so2) {
		
		int[] result = new int[so.length];
		int[] result2 = new int[so2.length];
		
		for(int i = 0; i<so.length; i++) {
			for(int j = 0; j<so2.length; j++) {
			so[i] = so[i] + so2[j];
			
		
			}		
	}

		return result;
		


	
}

}





public class Ex11_method_overloading {

	public static void main(String[] args) {
		
//		OverTest ot = new OverTest();
//		
//		
//		System.out.println(ot.add(100));
//		//ot.add(3.1f); // add(flaot f) 존재(x)
//		ot.add(100, "H");
//		
//		Human human = new Human();
//		ot.add(human);
//		System.out.println(human.name);
//		System.out.println(human.age);
//		
//
//		ot.add(new Human());
		
		
		OverTest ot = new OverTest();
		// int타입 배열의 주소값을 주어야 에러가 없음
		int[] source = {10, 20, 30, 40, 50};
		System.out.println(source);
		int[] target = ot.add(source); // source 는 주소값임 [I@15db9742 주소값
		
		for(int i = 0; i<target.length; i++) {
			System.out.println(target[i]);
			
		}
		
		OverTest ot2 = new OverTest();
		
		int[] so = {10,20,30,40,50};
		int[] so2 = {20,30,40,50,60};
		
		int[] result = ot2.add(so, so2);
		
		for(int i = 0; i<so.length; i++) {
			
			System.out.printf("[%d]", so[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
