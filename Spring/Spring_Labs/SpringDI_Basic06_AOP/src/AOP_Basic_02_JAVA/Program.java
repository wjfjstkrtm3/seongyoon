package AOP_Basic_02_JAVA;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		Calc calc = new NewCalc();
		//calc.ADD(100,200);
		
		//Proxy 객체 통해서 처리
		
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), //실제 클래스 메타 정보
				               calc.getClass().getInterfaces(), //행위정보(인터페이스)
						       new LogPrintHandler(calc)); //보조관심 >> 실객체 주소
		//Proxy 를 통해서 처리하지만
		//사용자는 실제 Calc 객체를 사용하는 것 처럼.....
		//MUL , ADD , SUB  >>  LogPrintHandler 객체의 invoke 함수 호출 (대리함수)
		
		//cal.MUL(x, y)
		int result = cal.MUL(5000, 2000);
		System.out.println("main : " + result);
	}

}
