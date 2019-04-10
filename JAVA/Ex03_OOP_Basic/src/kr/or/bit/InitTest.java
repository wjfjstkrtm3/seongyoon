package kr.or.bit;

public class InitTest {

	public static int cv = 1; // class variable, static variable
	public int iv = 1; // 명시적 초기화
	
	static { // static 초기화 블록, class 초기화 블록
		cv = 2;
		 // 
	}
	{iv = 2;} // 인스턴스 초기화 블록
	
	public InitTest() { // 생성자 함수 (초기화: instance variable, member field 초기화)
		iv = 3;
	}
}
