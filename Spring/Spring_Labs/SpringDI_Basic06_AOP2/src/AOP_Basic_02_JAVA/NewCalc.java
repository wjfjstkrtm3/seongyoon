package AOP_Basic_02_JAVA;

public class NewCalc implements Calc{

	@Override
	public int ADD(int x, int y) {
		int sum = x + y;
		return sum;
	}

	@Override
	public int MUL(int x, int y) {
		int mul = x * y;
		return mul;
	}

	@Override
	public int SUB(int x, int y) {
		int sub = x / y;
		return sub;
	}
		
}
