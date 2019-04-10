package kr.or.bit;

import java.io.IOException;

public class ExClass {

	public ExClass(String path) throws IOException, ArithmeticException{ 
		// 강제로 예외를 던진거임  --> ExClass를 사용하고싶으면 예외처리를 해야함
		
	}
	
	public void call() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("call 함수 start");
		int i = 1/0;
		System.out.println("call 함수 end");
		
	}
}
