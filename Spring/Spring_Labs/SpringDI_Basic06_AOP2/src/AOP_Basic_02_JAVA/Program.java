package AOP_Basic_02_JAVA;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		
		Calc calc = new NewCalc();
		// proxy 객체를 통해서 처리
		
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(),
												calc.getClass().getInterfaces(),
												new LogPrintHandler(calc));
		int result = cal.MUL(5000, 2000);
		System.out.println("main : " + result);
		
		
	}

}
