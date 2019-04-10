package kr.or.bit;


//class == type(큰 타입 : 여러개를 포함하는 타입) == 설계도
//설계도의 기본 구성 요소 : 속성(고유, 상태, 객체) + 행위
//속성(변수), 행위(함수)
//**주의** 속성이 하나의 값으로 표현되지 않는다면 > 클래스 타입으로 만들어라
	
public class Person {


	public String name; // instance variable (member filed)
	public int age;
	
	public void print() { // method (call 호출에 의해서 동작)
		System.out.println(name + "/" + age);
		
	}
}
