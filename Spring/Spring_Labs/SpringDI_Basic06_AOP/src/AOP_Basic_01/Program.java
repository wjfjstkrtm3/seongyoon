package AOP_Basic_01;

public class Program {

	public static void main(String[] args) {
		Cal cal = new Cal();
		int result = cal.Add(10000, 20000);
		System.out.println("Add result : " + result);

		result = cal.Mul(10000, 20000);
		System.out.println("Mul result :" + result);
	}

}
